package Aula10.Ex103;
import java.util.Scanner;
import java.util.Map;
//import java.util.HashMap;
import java.util.Collection;
import java.util.LinkedList;
//import java.util.TreeMap;
import java.util.LinkedHashMap;

public class Ex103 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        Map<Character, Collection> poStr = new LinkedHashMap<>();
        String input;
        
        System.out.print("A frase para analisar -->: ");
        input = sc.nextLine();
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            Collection<Integer> list = new LinkedList<>();
            for(int j = 0; j < input.length(); j++){
                char d = input.charAt(j);
                String s = Character.toString(c);
                String x = Character.toString(d);
                if(x.equalsIgnoreCase(s))
                    list.add(j);
                if(!poStr.containsKey(c)){
                    poStr.put(c, list);
                }
            }
        }
        System.out.println(poStr);
        sc.close();



    }
    
}
