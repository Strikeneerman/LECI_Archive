import java.util.Scanner;
import java.io.*;
public class Ex9_7 {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		String frase = new String();
		System.out.print("Insira uma frase: ");
		frase = sc.nextLine();
		capitalize(frase);
		System.out.println(frase);
		
	}
	public static String capitalize( String frase)
	{
		String primeira="";
		boolean estaDentro = false;
		for(int j=0;j<frase.length;j++)
		{
			char a = frase.charAt(j);
			if (estaDentro)
			{
					
			}
			else {primeira=primeira+b;}
			
		}
		return primeira;
	}
}

