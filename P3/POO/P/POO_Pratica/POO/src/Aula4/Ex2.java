package Aula4;
import java.util.Scanner;
public class Ex2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Insira uma string: ");
        String str = sc.nextLine();
        System.out.println("A string tem "+countDigits(str)+" numeros");
        System.out.println("A string tem "+countSpace(str)+" espaços");
        soMinusculas(str);
        System.out.println(muitosParaUm(str));
        palindromo(str);
    }

    public static int countDigits(String s){
        int count=0;
        for(int i=0 ; i<s.length(); i++){
           if(Character.isDigit(s.charAt(i))){
            count++;
           } 
        }
        return count;
    }
    public static int countSpace(String s){
        int spacecount = s.split(" ").length-1;

        return spacecount;
    }
    public static void soMinusculas(String s){
        boolean minus=true;
        s.split(" ");
        char charArray[] = s.toCharArray();
        for(int i = 0; i < charArray.length;i++){
            if(Character.isLetter(charArray[i])){
                if(!Character.isLowerCase(charArray[i])){
                    minus = false;   
                  }
            }
        }
        if(minus){System.out.println("Esta string só tem minusculas");}

    }
    public static String muitosParaUm(String s){
        String b = s.trim().replaceAll("\\s{2,}", " ");
        return b;
    }
    public static void palindromo(String s){
        boolean palin = true;
        int i = 0, j = s.length() - 1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)) palin = false;
            i++;
            j--;
        }
        if(palin) System.out.print("A string é um palindromo");
    }
}
