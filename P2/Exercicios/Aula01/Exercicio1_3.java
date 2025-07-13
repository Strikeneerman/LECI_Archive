/*Aula pratica 1
 * 
 * Exercicio 1.3 
 */
import static java.lang.System.*;
import java.util.Scanner;
public class Exercicio1_3 {
	public static final Scanner in = new Scanner(System.in);
	
	public static void main (String[] args) {
	  int n;
      while (true) {
      out.print("N? ");
      n = in.nextInt();
      if (n > 0) break;
      err.println("ERROR: invalid number!");
    }

    String verb = isPrime(n)? "is" : "is not";
    out.printf("Number %d %s prime\n", n, verb);
	}
	public static boolean isPrime(int n) {
		boolean prime;
    if((n==2)||(n==3)||(n==5)||(n==7)||(n==11)||(n==13)||(n==17))
		{
			prime = true;
			
		}
	else if((n%2==0)||(n%3==0)||(n%5==0)||(n%7==0)||(n%11==0)||(n%13==0)||(n%17==0)){
			
			prime = false;
			
		}
	else {
			prime = true;
			
		}
		return prime;
  }
}

