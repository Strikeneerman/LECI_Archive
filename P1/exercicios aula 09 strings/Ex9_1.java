import java.util.Scanner;
import java.io.*;
public class Ex9_1 {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char letra;
		int i, UpCase=0, LowCase=0, Digit=0, Vogal=0, Consoante=0;
		String frase = new String();
		System.out.print("Insira uma frase: \n");
		frase = sc.nextLine();
		for(i=0; i<frase.length() ;i++)
		{
			letra = frase.charAt(i);
			if(Character.isUpperCase(letra))
			{	if(isVoel(letra))
				{
					Vogal++;
				}
				else {Consoante ++;}
				UpCase++;
			}
			else if(Character.isLowerCase(letra))
			{
				/*Também dá se fizer 
				 if(!isVoel(letra))
				{
					Consoante++;
				}
				else {Vogal++;} */
				if(isVoel(letra))
				{
					Vogal++;
				}
				else {Consoante ++;}
				LowCase++;
			}
			else if(Character.isDigit(letra)){Digit++;}
		}
		System.out.printf("Analise de uma frase\n");
		System.out.println("Frase de entrada -> " + frase);
		System.out.println("Numero de caracteres minusculos -> " + LowCase);
		System.out.println("Numero de caracteres maiusculos -> " + UpCase);
		System.out.println("Numero de caracteres numericos -> " + Digit);
		System.out.println("Numero de vogais -> " + Vogal);
		System.out.println("Numero de consoantes -> " + Consoante);
	}
	public static boolean isVoel(char c)
	{
		boolean vogal;
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'||c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
		{
			vogal  = true;
		}
		else{ vogal = false;}
		return vogal;
	}
}

