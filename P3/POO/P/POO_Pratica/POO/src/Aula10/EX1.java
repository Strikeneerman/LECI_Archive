package Aula10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EX1 {
   
   
    public static void main(String[] args) {
        Map<String,String> cores = new HashMap<>(){
        @Override
        public String toString(){
            String str = "";
            Iterator<String> itr = keySet().iterator();
            while (itr.hasNext()){
                String sec = itr.next();
                str += sec + ":" + get(sec)+ "\n" ; 
            }
        while (itr.hasNext()){
            String sec = itr.next();
            str = sec;
        }
        while (itr.hasNext()){
            String sec = itr.next();
            str =  get(sec); 
        }
            return str;
            }

        };

        cores.put("Branco", "Que tem cor da neve");
        cores.put("Preto","Que tem cor da noite");
        cores.put("Amarelo","Que tem cor do sol");
        cores.put("Azul","Que tem cor do ceu");
        cores.put("Vermelho","Que tem cor do sangue");
        System.out.println("Contem " + cores.size() + " elementos" );
        System.out.println(cores.toString());

        cores.replace("Vermelho","Cor da maca"); 

        cores.remove("Azul");

       // System.out.println(cores);


    }

    
    
    
}


