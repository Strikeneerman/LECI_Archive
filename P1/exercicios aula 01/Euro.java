import java.util.Scanner;
public class Euro 
{
	
	public static void main (String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		double dolares, taxa;
		double euros;
		System.out.print("Dinheiro em dolares: ");
		dolares = sc.nextDouble();
		System.out.print("Taxa de conversao: ");
		taxa = sc.nextDouble();
		euros=taxa*dolares;
		System.out.printf("%4.2f dolares equivalem a %4.2f euros%n", dolares, euros);
	}
}

