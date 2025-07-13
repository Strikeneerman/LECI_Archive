package Aula11.Ex2;

import java.util.Scanner;
import java.util.Set;
import java.io.*;
//import java.util.ArrayList;
//import java.util.Comparator;
import java.util.HashMap;
//import java.util.Iterator;
//import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Ex2 {
    public static void main(String[]args){

        try(Scanner input = new Scanner(new File("voos.txt")); Scanner in = new Scanner(new File("companhias.txt"))){
            Voo agencia[] = new Voo[1000];
            int ind = 0;
            //int size = 0;
            Map<String, String> map = new TreeMap<>();
            Map<String, Integer> atrasoCompMap = new TreeMap<>();
            Map<String,Integer> vooCidadeMap = new TreeMap<>();
            Map<String,Integer> vooCompanhiaMap = new TreeMap<>();

            while(in.hasNextLine()){
                String stp = in.nextLine();
                String vect[] = stp.split("\t");
                if(!vect[0].equals("Sigla") && !vect[1].equals("Companhia"))
                map.put(vect[0], vect[1]);
            }
            while(input.hasNextLine()){
                String word = input.nextLine();
                String ar[] = word.split("\t");
            
                if(!ar[0].equals("Hora") && !ar[1].equals("Voo") && !ar[2].equals("Origem")){
                        String sigla = ar[1].substring(0,2); 
                        String companhia = "";
                        if(map.containsKey(sigla))
                          companhia = map.get(sigla);
                          
                        if(ar.length > 3){
                            if(!ar[3].equals("Atraso")){
                                 /*Hora de chegada: */ 
                                String time[] = ar[0].split(":");
                                int Hora = Integer.parseInt(time[0]);
                                int minuto = Integer.parseInt(time[1]);
                                /*&&&&&&&&&&&&&&&&&&&&&&&&& FIM &&&&&&&&&&&&&&&&&&&&&&&&& */ 

                                /*Hora do Atraso: */
                                String atraso[] = ar[3].split(":");
                                int HoraA = Integer.parseInt(atraso[0]);
                                int minutoA = Integer.parseInt(atraso[1]);
                                /*&&&&&&&&&&&&&&&&&&&&&&&&& FIM &&&&&&&&&&&&&&&&&&&&&&&&& */ 

                                /* calculo da hora prevista:*/
                                int minuF = minuto + minutoA;
                                int horaF = Hora + HoraA;
                                if(minuF >= 60){
                                    minuF = minuF - 60;
                                    horaF += 1;  
                                }
                                if(horaF > 23){
                                    horaF = horaF - 24;
                                }
                                /*&&&&&&&&&&&&&&&&&&&&&&&&& FIM &&&&&&&&&&&&&&&&&&&&&&&&& */ 

                                /*Calculo e salvaguarda do Atraso Total*/ 
                                if(HoraA > 0){
                                    HoraA = Hora * 60;
                                }
                                int totalMinuAtraso = HoraA + minutoA;   
                                if(!atrasoCompMap.containsKey(companhia)){
                                    atrasoCompMap.put(companhia,totalMinuAtraso);
                                }
                                else{
                                    atrasoCompMap.put(companhia, atrasoCompMap.get(companhia) + totalMinuAtraso);
                                }
                                /*&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& FIM &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&*/
                                /*Calculo de Voo por companhia */ 
                                if(!vooCompanhiaMap.containsKey(companhia)){
                                    vooCompanhiaMap.put(companhia,1);
                                }else{
                                    vooCompanhiaMap.put(companhia, vooCompanhiaMap.get(companhia) + 1);
                                }
                                /*&&&&&&&&&&&&&&&&&&&&&&&&& FIM &&&&&&&&&&&&&&&&&&&&&&&&& */ 
                                
                                String obs = "Previsto:" +  String.format("%2d:%2d", horaF,minuF);
                                agencia[ind] = new Voo(ar[0], ar[1], companhia, ar[2], ar[3], obs);
                                ind++;
                               // size = ind;
                            }
                        }
                        else{
                            agencia[ind] = new Voo(ar[0], ar[1], companhia, ar[2]);
                            ind++;
                           // size = ind;
                        }
                    /*Calcolo de voo total por cidade */
                    if(!vooCidadeMap.containsKey(ar[2])){
                        vooCidadeMap.put(ar[2],1);
                    }else{
                        vooCidadeMap.put(ar[2], vooCidadeMap.get(ar[2]) + 1);
                    }
                    /*&&&&&&&&&&&&&&&&&&&&&&&&& FIM &&&&&&&&&&&&&&&&&&&&&&&&& */
                }
                /*
                if(size == agencia.length - 3){
                   // full(agencia);
                }
                */
            }
            /*Ecercicio A */
            String s = String.format("%s\t%s\t%s\t%s\t%s\t%s\n","Hora","Voo","Companhia","Origem","Atraso","Obs");
            System.out.print(s);
            for(Voo u: agencia){
                if(u != null)
                  System.out.println(u);
            }
            File out = new File("Infopublico.txt");
            if(!out.exists())
               out.createNewFile();
            if(!out.canWrite())
               System.out.println("Ficheiro não pode ser alterado!");
            FileWriter fw = new FileWriter(out, false);
            PrintWriter pw = new PrintWriter(fw);
            pw.write(s);
            for(int i = 0; i < agencia.length; i++){
                if(agencia[i] != null){
                    pw.println(agencia[i]);
                }
            }
            pw.close();
            /*&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& FIM &&&&&&&&&&&&&&&&&&&&&&&&&&& */
           /*Exercicio B */
           Map<String,Double> atraMedioCompMap = new  TreeMap<>();
           Set<Entry<String, Integer>> set = atrasoCompMap.entrySet();
           for(Entry<String, Integer> aux : set){
               if(vooCompanhiaMap.containsKey(aux.getKey())){
                    double media = aux.getValue() / vooCompanhiaMap.get(aux.getKey());
                    atraMedioCompMap.put(aux.getKey(), media);
               }
           }
           System.out.print("Companhia\tAtraso medio\n");
           Set<Entry<String,Double>> medioSet = atraMedioCompMap.entrySet();
           for(Entry<String, Double> aux2 : medioSet){
               System.out.println(aux2.getKey() + "\t" + aux2.getValue());
           }
            /*&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& FIM &&&&&&&&&&&&&&&&&&&&&&&&&&& */
            
           /*Exercicio C*/
           File nfl = new File("cidades.txt");
           if(!nfl.exists())
             nfl.createNewFile();
           if(!nfl.canWrite())
              System.out.println("Ficheiro não pode ser editado");
           FileWriter nfw = new FileWriter(nfl, false);
           PrintWriter npw = new PrintWriter(nfw);

           String x = String.format("%s\t%s\n","Origem","Voos");
           npw.write(x);
           Map<String, Integer> vooPOrigemMpa = new HashMap<>();
           //List<Integer> list = new ArrayList<>();
           //List<String> list1 = new ArrayList<>();
           int lista[] = new int[1000];
           String lista1[] = new String[1000];

           Set<Entry<String, Integer>> temp = vooCidadeMap.entrySet();
           int indexInt = 0;
           for(Entry<String,Integer> temp2 : temp){
               lista[indexInt] = temp2.getValue();
               lista1[indexInt] = temp2.getKey();
               indexInt++;
              // list.add(temp2.getValue());
               //list1.add(temp2.getKey());
           }
      
           for(int i = 0; i < lista1.length - 1; i++){
               for(int j = i+1; j < lista1.length - 2; j++){
                    if(lista[i] < lista[j]){
                        int aux = lista[j];
                        lista[j] = lista[i];
                        lista[i] = aux;
                        //String: 
                        String aux2 = lista1[j];
                        lista1[j] = lista1[i];
                        lista1[i] = aux2;
                        
                    }
                  
               }
           }
           
           for(int i = 0; i < lista1.length - 1; i++){
               vooPOrigemMpa.put(lista1[i], lista[i]);   
           }
           Set<Entry<String, Integer>> hasSet = vooPOrigemMpa.entrySet();
           for(Entry<String, Integer> aux : hasSet){
               npw.println(aux.getKey() + "\t" + aux.getValue());
           }
           npw.close();
           /*&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& FIM &&&&&&&&&&&&&&&&&&&&&&&&&&& */
           
        }catch(Exception e){
            System.out.println(e);
        }
    }
    /*
    private static void full(Voo[] a){
        Voo aux[] = a;
        a = new Voo[a.length * 10];
        for(int i = 0; i < aux.length; i++){
            a[i] = aux[i];
        }
    } 
    */
}
