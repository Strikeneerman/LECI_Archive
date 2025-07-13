import java.util.Scanner;
public class Ordemcresc
{
	public static void main (String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int a,b,c,i;
		
		System.out.print("Insira o primeiro numero ");
		a = ler.nextInt();
		System.out.print("Insira o segundo numero ");
		b = ler.nextInt();
		System.out.print("Insira o terceiro numero ");
		c = ler.nextInt();

        if (a>b){
				
			i=a;
			a=b;
			b=i;
			}

		if (a>c){
			
			i=c;
			c=a;
			a=i;
		}
		if (b>c){
			
			i=c;
			c=b;
			b=i;
			
		}
		
		System.out.printf("Os numeros ordenados por ordem crescente sao : %d, %d, %d .",a,b,c);
		
	}
}

