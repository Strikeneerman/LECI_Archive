import java.util.Scanner;
public class Invertido {
	
	public static void main (String[] args) 
	{
		Scanner ler= new Scanner(System.in);
		int num;
		int inver = 0;
		
		System.out.print("Insira um numero decimal: ");
		num = ler.nextInt();
		if (num < 0)
		{
			System.out.printf("Numero invalido");
		}
		else if (num >0)
		{
			while(num >0)
			{
			inver = inver * 10;
			inver = inver + (num % 10);
			num = num / 10;
			}
		}
		System.out.printf("%d",inver);
	}
}

