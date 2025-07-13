import java.util.Scanner;
public class Bilhete {
	
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		double idade;
		System.out.print("Insira a sua idade:");
		idade = ler.nextDouble();
		if(idade<6){
			System.out.printf("Insento de pagamento\n");
			}
		else if (idade>=6 && idade<=12){
			System.out.printf("Bilhete de criança\n");
			}
		else if (idade>=13 && idade <=65){
			System.out.printf("Bilhete normal\n");}
		else if (idade>65){
			System.out.printf("Bilhete de 3ªidade\n");
			}	 
	}
}

