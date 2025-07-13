import java.util.Scanner;
public class Leibnitz
{
	
	public static void main (String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int n;
		double pi=0, det = 1,i;
		System.out.print("Insira um valor: ");
		n = ler.nextInt();
		for( int x=0; x<n;x++)
		{
			if(x % 2 == 0)
			{
			pi = pi + 1/det;
			}
			else
			{
			pi = pi - 1/det;	
			}
			det = det + 2;
		}
		i=Math.PI/4;
		System.out.printf("%2.15f\n",pi);	
		if(i>pi)
		{
		 System.out.printf("π/4 é maior\n"); 
		}
		else if (i<pi)
		{
		 System.out.printf("π/4 é menor\n");
		}
		else
		{
		 System.out.printf("π/4 é %2.15f\n",pi);
		}			
	}
}

