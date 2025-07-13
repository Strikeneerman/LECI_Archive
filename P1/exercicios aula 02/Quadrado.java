import java.util.Scanner;
public class Quadrado {
	
	public static void main (String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		double x1, x2, x3, x4, y1, y2, y3, y4, lado1, lado2;
		
		System.out.print("Insira as coordenadas do primeiro ponto.");
		System.out.print("X: ");
		x1 = ler.nextDouble();
		System.out.println();
		System.out.print("Y: ");
		y1 = ler.nextDouble();
		System.out.println();
		
		System.out.print("Insira as coordenadas do segundo ponto.");
		System.out.print("X: ");
		x2 = ler.nextDouble();
		System.out.println();
		System.out.print("Y: ");
		y2 = ler.nextDouble();
		System.out.println();
		
		System.out.print("Insira as coordenadas do terceiro ponto.");
		System.out.print("X: ");
		x3 = ler.nextDouble();
		System.out.println();
		System.out.print("Y: ");
		y3 = ler.nextDouble();
		System.out.println();
		
		System.out.print("Insira as coordenadas do quarto ponto.");
		System.out.print("X: ");
		x4 = ler.nextDouble();
		System.out.println();
		System.out.print("Y: ");
		y4 = ler.nextDouble();
		System.out.println();
		
		lado1 = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
		lado2 = Math.sqrt(Math.pow((x3-x4),2)+Math.pow((y3-y4),2));
		
		if(lado1 == lado2)
		{
			System.out.printf("E um quadrado");
		}
		else
		{
			System.out.printf("Nao e um quadrado");
		}	
	}
}

