import java.util.Scanner;
public class Primo
{
	public static void main (String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int num,i;
		System.out.print("Insira um numero positivo: ");
		num = ler.nextInt();
		while(num<0){
			System.out.print("Numero invalido.\n");
			System.out.print("Insira outro numero: ");
			num = ler.nextInt();
			}
		if((num==2)||(num==3)||(num==5)||(num==7)||(num==11)||(num==13)||(num==17))
		{
			System.out.print("O numero e primo.\n");
		}
		else if((num%2==0)||(num%3==0)||(num%5==0)||(num%7==0)||(num%11==0)||(num%13==0)||(num%17==0))
		{
			System.out.print("O numero nao e primo.\n");
		}
		else
		{
			System.out.print("O numero e primo.\n");
		}
		
	}
}

