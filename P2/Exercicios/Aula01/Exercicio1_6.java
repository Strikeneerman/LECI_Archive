/*Aula pratica 1
 * 
 * Exercicio 1.6
 */
import java.util.Scanner;
public class Exercicio1_6 {
	public static final Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		int ronda=0,tentativa;
		int numero = (int)(Math.random()*(100+1));
		System.out.print("Vamos jogar ao Adivinha o número!\n");
		System.out.print("Insire um numero de 1 a 100: ");
		tentativa = sc.nextInt();
		while(tentativa < 1 || tentativa >100)
		{
			System.out.print("Numero Invalido!");
			System.out.print("\n Insire um numero de 1 a 100: ");
			tentativa = sc.nextInt();
		}
		while(tentativa != numero)
			{
				if(tentativa < numero)
				{
					System.out.print("O numero é maior do que esse.");
				}
				else if (tentativa > numero)
				{
					System.out.print("O numero é menor do que esse.");
				}
				ronda++;
				System.out.print("\n Tenta outra vez! \n");
				tentativa = sc.nextInt();
				while(tentativa < 1 || tentativa >100)
				{
					System.out.print("Numero Invalido!");
					System.out.print("\n Insire um numero de 1 a 100: ");
					tentativa = sc.nextInt();
				}
			}
		System.out.print("O numero é igual!");
		System.out.println("\n Parabéns levou "+ronda+" tentativas");
		
	}
}

