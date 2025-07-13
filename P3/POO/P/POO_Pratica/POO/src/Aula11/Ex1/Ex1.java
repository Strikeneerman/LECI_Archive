package Aula11.Ex1;
import java.io.*;
import java.util.Scanner;
//import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.Map.Entry;


public class Ex1 {
    public static void main(String[]args){
        
        try(Scanner input = new Scanner(new File("major.txt"));){
            Map<String, Map<String, Integer>> map = new TreeMap<>();
            List<String> list = new ArrayList<>();
            /*/
            File fl = new File("newMajor.txt");
            if(!fl.exists())
              fl.createNewFile();
            if(!fl.canWrite())
              System.out.println("Ficheiro não pode ser editado!");
            FileWriter fw = new FileWriter(fl, false);
            PrintWriter pw = new PrintWriter(fw);
            while(input.hasNext()){
                String word = input.next();
                String palavra = word.replaceAll("/W", " ");
                pw.println(palavra);

            }
            pw.close();
            Scanner in = new Scanner(new File("newMajor.txt"));
            */
            while(input.hasNext()){
                String word = input.next();
                word = word.replaceAll("/W", " ");
                if(word.length() >= 3){
                    /* usar repleceAll os caracteres para outro
                    if(word.matches("/W")){
                        word = word.toLowerCase();
                        String ar[] = word.split("\t\n.,:';?!-*{=+&/()[]”“\"\'"); 
                        for(int i = 0; i < ar.length; i++){
                            if(ar[i].length() >= 3)
                              list.add(ar[i]);
                        }
                    }else{
                        word = word.toLowerCase();
                        list.add(word);
                    }

                    */
                    int cnt = 0;
                    for(int i = 0; i < word.length(); i++){
                        char c = word.charAt(i);
                        if(!Character.isLetter(c) && !Character.isDigit(c)){
                            cnt++;
                            break;
                        }
                    }
                    if(cnt == 0){
                        word = word.toLowerCase();
                        list.add(word);
                    }
                
                }
            }
            for(int i = 0; i < list.size()-1; i++){
                Map<String, Integer> otherMap = new TreeMap<>();
                /*/
                if(!otherMap.containsKey(list.get(i+1))){
                    otherMap.put(list.get(i+1), 1);
                }
                */
                /*else{
                    otherMap.put(list.get(i+1), otherMap.get(list.get(i+1)) + 1);
                }*/
                if(!map.containsKey(list.get(i))){
                    otherMap.put(list.get(i+1), 1);
                    map.put(list.get(i), otherMap);   
                }
                else{
                        otherMap = map.get(list.get(i));
                        if(otherMap.containsKey(list.get(i+1)))
                            otherMap.put(list.get(i+1), otherMap.get(list.get(i+1)) + 1);
                        else
                           otherMap.put(list.get(i+1), 1);
                        map.put(list.get(i), otherMap);
                     
                }
            }
            Set<Entry<String, Map<String, Integer>>> set = map.entrySet();
            for( Entry<String, Map<String, Integer>> aux : set){
                System.out.println(aux.getKey() + "=" +  aux.getValue());
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
