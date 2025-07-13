import java.util.Scanner;
public class Produtolista 
{
	public static void main (String[] args)
	{
		Scanner ler = new Scanner(System.in);
		double num,produto=1;
		System.out.print("Introduza uma lista de numeros (termina com 0): ");
		num = ler.nextDouble();
	    while(num != 0)
	    {
			produto = produto * num;
			System.out.print(" ");
			num= ler.nextDouble();
		}
		System.out.printf("Produto: %3.2f %n",produto);
	}
}

