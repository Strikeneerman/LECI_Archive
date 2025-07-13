/*Aula pratica 6
 * 
 * Exercicio 6.4
 */
import static java.lang.System.*;
public class Exercicio6_4 {
	
	public static void main (String[] args) {
		String ini = "";
		String rev = "";
		if(args.length==0) ini = "";
		else{
			for(int f = 0; f < args.length-1; f++){
			ini+=args[f];
			}
		}
		rev=ReverseString(args, args.length);
		out.println("Normal: "+ini+" ;Inverso: " + rev);
	}
	public static String ReverseString(String[] array, int N){
		String rever = "";
		if(N==0) return "";
		for(int i=0; i<N-1; i++)
		{
			rever+=array[i];
		}
		
		return array[N-1] + ReverseString(array,N-1);
	}
}

