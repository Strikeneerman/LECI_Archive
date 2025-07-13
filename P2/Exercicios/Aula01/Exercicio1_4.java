/*Aula pratica 1
 * 
 * Exercicio 1.4
 */
import java.util.Scanner;
public class Exercicio1_4 {
	public static final Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		    String s1 = new String();
			do {
				String traduzido;
				System.out.print("Linha: ");
				s1 = sc.nextLine();
				traduzido = tradutor (s1);
				System.out.println(traduzido);
			}while((!s1.equalsIgnoreCase("")));
	}
	public static String tradutor( String s1)
	{
			String s2 = new String();
			s2="";
			for (int pos = 0; pos < s1.length(); pos++)
			{
				char letra = s1.charAt(pos);
			
				if(letra=='l') s2+='u';
				else if (letra =='L') s2+='U';
				else if (letra =='r'||letra =='R'){}
				else {s2+= letra;} 
			}	
		return s2;
	}
}

