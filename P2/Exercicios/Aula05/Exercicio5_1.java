/*Aula pratica 5
 * 
 * Exercicio 5.1
 */
import static java.lang.System.*;
import util.Input;

public class Exercicio5_1 {
  
  static String MESSAGE =
    "This program requests several real values.\n" +
    "Try inserting numbers with invalid format or out of range.\n";
  
  public static void main(String[] args) {
    out.println(MESSAGE);
    boolean valid = false;
    while(!valid){
		
		try{
			double x = Input.getDouble("Real value X? ");
			out.println(x);
			valid = true;
			}
		catch(Exception e){
			System.out.printf("Invalid Input Format!");
			valid = false;
			}
	}
	valid = false;
	while(!valid){
		try{
			double nota = Input.getDouble("Nota? ", 0.0, 20.0);
			out.println(nota);
			valid = true;
			}
		catch(Exception e){
			System.out.println("Invalid Input Format!");
			valid = false;
			}
	}
    valid = false;
    while(!valid){
		try{
			double temp = Input.getDouble("Temperature (Celsius)? ", 
									-273.15, Double.POSITIVE_INFINITY);
			out.println(temp);
			valid = true;
			}
    catch(Exception e){
			System.out.printf("Invalid Input Format!");
			valid = false;
			}
	}
    double z = Input.getDouble("Nota? ", 0.0, -10.0);  // should fail!
    
  }
}

