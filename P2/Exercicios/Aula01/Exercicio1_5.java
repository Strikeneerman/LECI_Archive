/*Aula pratica 1
 * 
 * Exercicio 1.5
 */
import java.util.Scanner;
public class Exercicio1_5 {
	public static final Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		float a,soma=0;
		float c=0;
		float media;
		System.out.print("Insira uma lista de numeros ( insira 0 para terminar): ");
		a = sc.nextFloat();
		while(a != 0){
			soma += a;
			c++;
			a = sc.nextInt();
			}
		media = soma/c;
		System.out.printf("A soma dos numeros é %3.2f e a média é %3.2f",soma,media);	
	}
}

