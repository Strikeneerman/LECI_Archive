/*Aula pratica 6
 * 
 * Exercicio 6.3
 */
import static java.lang.System.*;

public class Exercicio6_3 {
  
  public static void main(String[] args) {
	out.print("Normal\n");
    printArray(args, args.length);
    out.print("Inverso\n");
    InverseArray(args, args.length);
  }

  /** Imprime as N primeiras strings do array, uma por linha. */
  public static void printArray(String[] array, int N) {
		if(N > 0){
		printArray(array, N-1);
		System.out.println(array[N-1] + "\n");
		}
  }
  public static void InverseArray(String[]array, int N){
	   if(N > 0){
		System.out.println(array[N-1] + "\n");
		printArray(array, N-1);   
	   }
  }

}

