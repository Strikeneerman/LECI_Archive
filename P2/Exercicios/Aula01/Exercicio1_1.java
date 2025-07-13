/* Aula pratica 1
 * 
 * Exercicio 1.1 Modo complexo
 */
import java.util.Scanner;

public class Exercicio1_1 {
	
	public static void main (String[] args) {
		System.out.print("Calculadora\n");
		System.out.print("Insira um numero: ");
		Scanner sc = new Scanner(System.in);
		double n1 = sc.nextDouble();
		System.out.print("Insira a operacao que pretende realizar: \n");
		char operacao = nextChar();
		while(operacao != '+' && operacao != '-' && operacao != '*' && operacao != '/')
		{
			System.out.print("Operacao invalida\n");
			System.out.print("Insira outra operacao:  ");
			operacao = nextChar();
		}
		System.out.print("Insira o outro numero: \n");
		double n2 = sc.nextDouble();
		switch(operacao)
		{
			case'+':
					double soma=n1+n2;
					System.out.println("Soma = "+soma);
					break;
			case'-':
					double subtracao=n1-n2;
					System.out.println("Subtracao = "+subtracao);
					break;
			case'*':
					double multi=n1*n2;
					System.out.println("Multiplicacao = "+multi);
					break;
			case'/':
					double div=n1/n2;
					System.out.println("Divisao = "+div);
					break;
			
		}
		
	}
	public static char nextChar(){
		String s = new String();
		Scanner sc = new Scanner(System.in);
		
		do {
            s = sc.nextLine();
        } while(s.length() != 1);
			
		return s.charAt(0);
		}
}

