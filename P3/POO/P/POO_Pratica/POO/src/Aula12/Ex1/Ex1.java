package Aula12.Ex1;
import java.util.Scanner;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
//import java.util.Collection;

public class Ex1 {
    public static void main(String[]args){
        try(Scanner input = new Scanner(new File("major.txt"),"UTF-8");){
            int cntPalavraDiferente = 0;
            List<String> list = new ArrayList<>();
            while(input.hasNext()){
                String word = input.next();
                if(!list.contains(word))
                    cntPalavraDiferente++;
                list.add(word);
                //System.out.println(word);
            }
            System.out.println("Número Total de Palavras: " + list.size());
            System.out.println("Número de Diferentes Palavras: " + cntPalavraDiferente);
        }catch(Exception e){
            System.out.println("Ocorência de Exessão: " + e);
        }
    }
}
