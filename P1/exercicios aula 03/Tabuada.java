import java.util.Scanner;
public class Tabuada
{
	public static void main (String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int n,i;
		System.out.print("Tabuada do: ");
		n = ler.nextInt();
		System.out.printf("----------------------\n");
		System.out.printf("|    Tabuada dos %2d  |\n",n);
		System.out.printf("----------------------\n");
		for(i=1;i<=10;i++)
		{
			System.out.printf("|  %2d  x %2d  |  %3d  |\n",n,i,n*i);
		}
		System.out.printf("----------------------\n");
	}
}

