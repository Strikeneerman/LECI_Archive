import java.util.Scanner;
//~ import static java.lang.System.*;
public class MDC {
	
	public static void main (String[] args){
		
		Scanner ler = new Scanner(System.in);
		int a,b,c,i,resto=1;
		
		System.out.print("Introduza um numero: ");
		a= ler.nextInt();
		System.out.print("Introduza outro numero: ");
		b= ler.nextInt();
		//~ if(a<b)
		//~ {
			//~ i=b;
			//~ b=a;
			//~ a=i;
			
		//~ }
			
		while(resto != 0){
			resto=a%b;
			a = a/b;
			b= resto;
			
				System.out.println(a);
		};
		
	
	
		
	}
}

