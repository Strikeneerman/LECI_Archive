import java.util.Scanner;
public class Compra {
	
	public static void main (String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		double produto,desconto,iva;
		double total;
		System.out.print("Insira o valor do produto: ");
		produto = ler.nextDouble();
		System.out.print("Insira o valor do desconto em percentagem: ");
		desconto = ler.nextDouble();
		desconto = desconto/100;
		System.out.print("Insira o valor do IVA em percentagem: ");
		iva = ler.nextDouble();
		iva = iva/100;
		total = (produto*(1-desconto))*(1+iva);
		System.out.printf("O valor total liquido e %6.2f euros.\n",total);
	}
}

