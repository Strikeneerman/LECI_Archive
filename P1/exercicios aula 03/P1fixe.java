import java.util.Scanner;
public class P1fixe 
{
	public static void main (String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int n,i;
		System.out.print("Quantas vezes pretende ver a mensagem?\n");
		i = ler.nextInt();
		for (n=1;n<=i;n++)
		{
			System.out.printf("P1 é fixe\n");
		}	
	}
}

