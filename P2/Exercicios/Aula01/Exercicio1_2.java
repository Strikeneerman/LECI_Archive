/*Aula pratica 1
 * 
 * Exercicio 1.2 
 */
 import static java.lang.System.*;
 import java.util.Scanner;
public class Exercicio1_2 {
	public static final Scanner in = new Scanner(System.in);
	
	public static void main (String[] args) {
		
	double pg1 = readInRange("PG1? ", 0.0, 20.0);
    double pg2 = readInRange("PG2? ", 0.0, 20.0);
    double tpi = readInRange("TPI? ", 0.0, 20.0);
    double ef = readInRange("EF? ", 0.0, 20.0);
    double nf = 0;

    nf = (pg1*0.15)+(pg2*0.15)+(tpi*0.2)+(ef*0.5);
    
    System.out.printf("NF = %.1f\n", nf);
    if (nf < 9.5)
      out.println("REPROVADO!");
    else
      out.println("APROVADO!");
		
	}
  // Reads a double that must be in the range [min, max].
  // Shows the prompt, reads a double value.
  // If the value is not in the range, prints a warning and repeats.
  public static double readInRange(String prompt, double min, double max)
  {
    assert min <= max : "max must be at least as large as min!";
    double value;
    System.out.println(prompt);
    value = in.nextDouble();
	while(value < min || value > max)
	{
			System.out.print("Numero invalido \n");
			System.out.println(prompt);
			value = in.nextDouble();
	}
    return value;
  }
}

