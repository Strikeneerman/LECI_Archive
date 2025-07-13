package Aula4;
import java.util.Scanner;

public class Ex3 {
    public static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) {
		String frase = new String();
		System.out.print("Insira uma frase que represente um acronimo: \n");
		frase = sc.nextLine();
		System.out.println("Possui como acronimo " + Acronimo(frase));
	}
    public static String Acronimo(String a){
        String strarray[];
        String b="";
        strarray = a.split(" ");
        for(int i = 0; i<strarray.length;i++){
            if(strarray[i].length()>=3){
                b+=strarray[i].charAt(0);
            }
        }
        return b;
    }
    
}
