import java.util.Scanner;
public class Num1000 
{
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		int i;
		int par=0,soma=0;
		System.out.print("Insira um numero positivo menor ou igual a 1000: ");
		N = sc.nextInt();
		
		while (N < 0 || N > 1000)
		{
				System.out.printf("Numero invalido\n");
				System.out.print("Insira um numero positivo menor ou igual a 1000: ");
				N = sc.nextInt();
		}
		for(i=1;i<=N;i++)
		{
			if((i%2)==0)
			{
			par = i;
			System.out.printf(" %d ",par);
			}
			soma += par;
		}
			
			System.out.println("\nA soma dos numeros pares e "+soma+".");
		
		
	}
}

