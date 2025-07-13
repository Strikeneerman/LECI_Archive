import java.util.Scanner;
public class Turista {
	
	public static void main (String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		double desp1;
		double desp2, desp3, desp4, despmedia;
		System.out.print("Qual foi o gasto do turista no primeiro dia?\n");
		desp1 = ler.nextDouble();
		desp2 = desp1*1.2;
		desp3 = desp2*1.2;
		desp4 = desp3*1.2;
		despmedia = (desp1+desp2+desp3+desp4)/4;
		System.out.printf("A despesa media do turista, ao fim de 4 dias, foi %6.2f euros",despmedia);	
	}
}

