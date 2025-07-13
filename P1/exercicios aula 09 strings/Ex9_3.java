import java.util.Scanner;
import java.io.*;
public class Ex9_3 {
	
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		String frase = new String();
		System.out.print("Insira uma frase\n");
		frase = sc.nextLine();
		System.out.println("A frase tem " + countWords(frase) + " palavras");
		
		
	}
	public static int countWords( String a)
	{	int i=0, fora=1;
		i = a.length();
		for(int j=1;j<i;j++)
		{
			char b = a.charAt(j);
			char c = a.charAt(j-1);
			if((c==' ' && b!=' '))
			{fora++;}
			/*else if (b=='\n' && c==' ')
			{fora--;}*/
		}
	
		return fora;
	}
}

