import java.util.Scanner;
public class Par 
{
	public static void main (String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int i;
		
		System.out.print("Introduza um numero inteiro ");
		i = ler.nextInt();
		
		if ((i%2)==0)
		{
			System.out.printf("O numero %d e par",i);
		}
		else 
		{
			System.out.printf("O numero %d nao e par",i);
		}
	}
}

