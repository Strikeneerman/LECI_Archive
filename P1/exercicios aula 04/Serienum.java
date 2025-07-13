import java.util.Scanner;
public class Serienum
{
	public static void main (String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int num, serie=0;
		System.out.print("Insira um numero real(<0 termina): ");
		num = ler.nextInt();
		while(num>=0)
		{
			serie=serie+1;
			System.out.print("Insira outro numero: ");
			num = ler.nextInt();
		}
		System.out.printf("Foram inseridos %d numeros.%n",serie);
	}
}


