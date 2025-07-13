import java.util.Scanner;
public class Altobaixo
{
	public static void main (String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int tentativa,num=1;
		int secret = (int)(100.0*Math.random()) + 1;
		System.out.printf("Vamos jogar ao AltoBaixo\n");
		System.out.printf("Insira um numero inteiro de 1 a 100: ");
		tentativa = ler.nextInt();
		while(tentativa != secret )
		{
			if(tentativa > secret)
			{
				System.out.print("Numero muito alto \n");
			}
			else if(tentativa < secret)
			{
				System.out.print("Numero muito baixo \n");
			}
			num++;
			System.out.print("Insira outro numero: ");
			tentativa = ler.nextInt();
		}
		System.out.printf("Parabens, levou %d tentativas.", num);
	}
}

