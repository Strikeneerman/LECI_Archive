import java.util.Scanner;
import java.io.*;
public class Ex9_2 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase = new String();
		System.out.print("Insira uma frase que seja represente um acronimo: \n");
		frase = sc.nextLine();
		System.out.println("Possui como acronimo " + acronimo(frase));
	}
	public static String acronimo(String a){
		int i = 0;
		i = a.length();
		String b="";
		for( int j=0; j<i;j++)
		{
			if(Character.isUpperCase(a.charAt(j)))
			{
				b+=a.charAt(j);
			}
		}
		return b;
	}
}

