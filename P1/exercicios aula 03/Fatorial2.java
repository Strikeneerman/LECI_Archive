import java.util.Scanner;
public class Fatorial2 
{
	public static void main (String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int m,i,fact;
		System.out.printf("Insira um numero entre 1 e 10\n");
		m = ler.nextInt();
		if(m>0 && m<=10)
		{
			for(i=1;i<=m;i++)
			{
				fact=1;
				for(int j=1;j<=i;j++)
				{
				fact = fact*j;
				}
				System.out.printf("%3d! = %d \n",i,fact);
			}
		}
		else 
		{
			System.out.printf("Numero invalido");
		}
	}
}

