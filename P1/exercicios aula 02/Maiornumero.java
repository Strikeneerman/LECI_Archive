import java.util.Scanner;

public class Maiornumero {
	
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		double A,B;
		System.out.print("Introduza um numero:");
		A = ler.nextDouble();
		System.out.print("Introduza outro numero:");
		B = ler.nextDouble();
		if (A>B){
			System.out.printf("O numero maior e: %6.2f\n", A);
		}
		else if (A<B){
			System.out.printf("O numero maior e: %6.2f\n", B);
		}
		else {
			System.out.printf("Os dois numeros sao iguais\n");
		}	
	}
}

