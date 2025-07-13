import java.util.Scanner;
public class Notas {
	
	public static void main (String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		double TP1, TP2, AP1, EP;
		double nota;
		System.out.print("Insira a nota do primeiro teste pratico: ");
		TP1 = ler.nextDouble();
		System.out.print("Insira a nota do segundo teste pratico: ");
		TP2 = ler.nextDouble();
		System.out.print("Insira a nota da aula pratica: ");
		AP1 = ler.nextDouble();
		System.out.print("Insira a nota do exame pratico: ");
		EP = ler.nextDouble();
		nota = (TP1*0.15)+(TP2*0.15)+(AP1*0.3)+(EP*0.40);
		System.out.printf("A nota final e %6.2f \n",nota);		
	}
}

