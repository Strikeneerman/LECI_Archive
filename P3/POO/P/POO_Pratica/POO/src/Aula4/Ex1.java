package Aula4;
import java.util.Scanner;
public class Ex1 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        String strarray[];
        System.out.print("Insira uma string: ");
        String str = sc.nextLine();
        System.out.println("Frase imprimida em minuscula: ");
        System.out.println(str.toLowerCase());
        System.out.println("Ultimo caracter da string: ");
        System.out.println(str.charAt(str.length()-1));
        System.out.println("3 primeiros caracteres: ");
        System.out.println(str.substring(0,3));
        System.out.println("Frase imprimida em maiuscula: ");
        System.out.println(str.toUpperCase());
        System.out.println("Palavras da frase");
        strarray = str.split(" ");
        for(int i = 0; i<strarray.length;i++){
            System.out.print(strarray[i]);
            System.out.print("; ");
        }
        System.out.println(str.indexOf("hey"));
        System.out.print("Insira outra frase:");
        String str2 = sc.nextLine();
        System.out.println("Concatenação das duas frases");
        System.out.print(str.concat(str2));

    }
}
