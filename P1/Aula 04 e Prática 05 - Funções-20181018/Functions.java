/*
 * JAM, out-2018
 *
 * Nesta classe deve definir novas funções e testá-las na função main.
 */
import java.util.Scanner;
public class Functions {

	public static void main (String args[]) {
		double n;
		int i,m,limInf,limSup;
		String linha;
		Scanner ler = new Scanner(System.in);
		// Testar função sqr:
		System.out.printf("sqr(%f) = %f\n", 10.1, sqr(10.1));
		System.out.printf("sqr(%f) = %f\n", -2.0, sqr(-2.0));
		
		System.out.printf("f(%d) = %f\n", 5, f(5));
		System.out.printf("max(%f,%f) = %f\n", 3.1, 5.2, max(3.1, 5.2));
		System.out.printf("max(%d,%d) = %d\n", 3, 2, max(3, 2));
		System.out.printf("!%d= %d\n",4 , fact( 4 ));
		System.out.print("Insira um numero positivo: ");
		n = ler.nextDouble();
		getIntpos(n);
		System.out.print("Insira limites\n");
		System.out.print("Limite inferior: \n");
		limInf = ler.nextInt();
		System.out.print("Limite Superior: \n");
		limSup = ler.nextInt();
		System.out.print("Insira um numero: \n");
		m = ler.nextInt();
		getIntRange(limInf, limSup, m);
		System.out.printf("Insira uma mensagem: ");
		linha = ler.next();
		System.out.printf("Quantas vezes pretende repetir a mensagem?\n");
		i = ler.nextInt();
		printNtimes(i,linha);
		
		

		// Invoque as funções pedidas no enunciado para as testar:
		// Por exemplo, para testar func f (problema 5.2):
		//System.out.printf("f(%d) = %f\n", 5, f(5));

		// Testar as restantes funções desenvolvidas
		//System.out.printf("max(%f,%f) = %f\n", 3.1, 5.2, max(3.1, 5.2));
		//System.out.printf("max(%d,%d) = %d\n", 3, 2, max(3, 2));
		//int ano = getIntPos("Ano? ");
		//System.out.printf("ano = %d\n", ano);

	}

	/*
	 * sqr - calcula o quadrado de um número (real).
	 */
	public static double sqr(double x) {
		double y;	// variavel para resultado
		y = x*x;	// calculo do resultado a partir dos dados
		return y;	// devolver o resultado
	}

	// Defina as funções pedidas no enunciado:
	public static double f(double n){
		double i;
		i=1.0/(1.0+Math.pow(n,2));
		return i;
		}
	
	public static double max(double n, double y){
		double i=1;
		if (n > y)
		{
			i=n;
		}
		else if(y > n)
		{
			i=y;
		}
		return i;
	}
	
	public static int max(int n, int y){
		int i=0;
		if (n > y)
		{
			i=n;
		}
		else if(y > n)
		{
			i=y;
		}
		return i;
		}
		
	public static int fact(int n){
		int i,fact=1;
		
		for (int j=1;j<=n;j++){
			
			fact=fact*j;
			}
			i=fact;
			return i;
		
		}
	
	public static void getIntpos(double n){
		Scanner ler = new Scanner(System.in);
		
		while(n<0)
		{
			System.out.printf("Numero negativo inserido.\n");
			System.out.printf("Insira um numero positivo: ");
			n = ler.nextDouble();
			}
			System.out.printf("Numero positivo inserido.\n");
		
		}
	public static void getIntRange(int limInf, int limSup, int num)
	{  if (num >= limInf && num<= limSup)
		{
			System.out.printf("Esta dentro\n");
		} 
	}
	public static void printNtimes(int num,String linha)
	{
		int i=0;
		while(i<num){
			System.out.printf("%s\n",linha);
			i++;
			}
	}
}
