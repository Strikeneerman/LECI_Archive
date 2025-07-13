package Aula10.Ex104;
import java.util.Scanner;
import java.io.*;
import java.util.List;
import java.util.LinkedList;

public class Ex104 {
    public static void main(String[]args) throws IOException {

        Scanner input = new Scanner(new FileReader("Biblioteca.txt"));
        List<String> list = new LinkedList<>();

        while(input.hasNext()){
            String word=input.next();
            if(word.length() > 2 ){
                list.add(word);
            }
            System.out.println(word);
        }
        System.out.println();
        for(int i = 0; i < list.size(); i++){
            String s = list.get(i);
            if(s.endsWith("s"))
              System.out.println(s);
        }
        for(int i = 0; i < list.size(); i++){
             int cnt = 0;
             String s = list.get(i);

             for(int j = 0; j < s.length(); j++){
                 char c = s.charAt(j);
                 if((!Character.isLetter(c)) && Character.isDigit(c))
                  cnt++;
             }
             if(cnt > 0){
               list.remove(s);
               i = 0;
             }    
            
        }
        System.out.println(list);
    }
    
}
