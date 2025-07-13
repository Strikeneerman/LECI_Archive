/*Aula pratica 2
 * 
 * Exercicio 2.1
 */
import static java.lang.System.*;
import java.util.Scanner;
public class Exercicio2_1 {
	public static final Scanner sc = new Scanner(System.in);	
	public static void main (String[] args) {
	double i,j;
	System.out.print("Re: ");
	i = sc.nextDouble();
	System.out.print("Int: ");
	j = sc.nextDouble();
	Complex a = new Complex(i, j);

    // Vamos usar métodos do objeto a
    out.println("(" + a.real() + " + " + a.imag() + "i)");
    out.println("  parte real = " + a.real());
    out.println("  parte imaginaria = " + a.imag());
    out.println("  modulo = " + a.abs());
    out.printf("  argumento =  %2.2f\n", a.arg());
	}
}

