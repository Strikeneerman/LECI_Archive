import java.util.Scanner;
public class Intervaloimpar{
	
	public static void main (String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int a,b,i=0;
		System.out.print("A: ");
		a=ler.nextInt();
		System.out.print("B: ");
		b=ler.nextInt();
		if(a>b)
			{
				i=a;
				a=b;
				b=i;
				
			}
		for(i=a;(b>=i && i>=a);i++)
		{
				if(i%2==1){
					System.out.printf("%d\n",i);
					}
		}
		
		
	}
}

