import java.util.Scanner;
public class Maiortres 
{
	public static void main (String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int x, y, z;
		
		System.out.printf("Insira um numero: ");
		x = ler.nextInt();
		System.out.println();
		System.out.printf("Insira outro numero: ");
		y = ler.nextInt();
		System.out.println();
		System.out.printf("Insira outro numero: ");
		z = ler.nextInt();
		System.out.println();
		
		if(x>=y)
		{
			if(x>=z)
			{
				System.out.printf("%d e o maior.",x);
			}
			else if (x<=z)
			{
				System.out.printf("%d e o maior.",z);
			}
		}
		else if(y>=x)
		{
			if (y>=z)
			{
				System.out.printf("%d e o maior.",y);
			}
			else if (y<=z)
			{
				System.out.printf("%d e o maior.",z);
			}
			
		}
		
		
	}
}

