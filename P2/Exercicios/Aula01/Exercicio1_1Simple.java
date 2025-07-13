/*Aula pratica 1
 * 
 * Exercicio 1.1 Modo simples
 */
 import java.util.Scanner;
public class Exercicio1_1Simple {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = new String();
		double n1,n2,op=0;
		System.out.print("Operacao: ");
		n1 = sc.nextDouble();
		s = sc.next();
		n2 = sc.nextDouble();
		if(s.equals("+"))
		{
			op=n1+n2;
		}
		else if (s.equals("-"))
		{
			op=n1-n2;
		}
		else if (s.equals("*"))
		{
			op=n1*n2;
		}
		else if (s.equals("/"))
		{
			op=n1/n2;
		}
		else
		{
				System.out.printf("Operacao invalida");
		}
		System.out.println(op);	
	}
}

