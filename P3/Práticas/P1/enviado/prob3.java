package aula1;
import java.util.*;
public class prob3 {
	
	public static Scanner sc = new Scanner(System.in);
	public static void main(final String[] args) {
		
		int choice;
		do {
			System.out.println("1 - Adicionar Quadrado");
			System.out.println("2 - Adicionar Retangulo");
			System.out.println("3 - Adicionar Circulo");
			System.out.println("4-  Verificar se circulos sao iguais e se se intersetam");
			System.out.println("5 - Sair");
			System.out.print("Escolha uma opcao: ");
			
			choice = Integer.parseInt(sc.nextLine());
			System.out.println();
			
			switch(choice) {
			case 1: 
				System.out.println("Lado do quadrado:");
				final int lado = Integer.parseInt(sc.nextLine());
				final Quadrado a = new Quadrado(lado);
				System.out.println(a.toString());
					
				break;
			
			case 2:
				System.out.println("Comprimento do retangulo:");
				final int comprimento = Integer.parseInt(sc.nextLine());
				
				System.out.println("Largura do retangulo:");
				final int largura = Integer.parseInt(sc.nextLine());
				
				final Rectangulo b = new Rectangulo(comprimento,largura);
				System.out.println(b.toString());
				break;
				
			case 3:
				System.out.println("Raio do Circulo:");
				final double raio = Double.parseDouble(sc.nextLine());
				
				System.out.println("Coordenada x do centro :");
				final double x = Double.parseDouble(sc.nextLine());
				
				System.out.println("Coordenada y do centro :");
				final double y = Double.parseDouble(sc.nextLine());
				
				final Ponto d = new Ponto(x,y);
				final Circulo c = new Circulo(raio,d);
				
				System.out.println(c.toString());
				break;
			
			case 4:
				System.out.println("Raio do Circulo 1:");
				final double r1 = Double.parseDouble(sc.nextLine());
				
				System.out.println("Coordenada x do centro :");
				final double x1 = Double.parseDouble(sc.nextLine());
				
				System.out.println("Coordenada y do centro :");
				final double y1 = Double.parseDouble(sc.nextLine());
				
				final Ponto p1 = new Ponto(x1,y1);
				final Circulo c1 = new Circulo(r1,p1);
				
				System.out.println("Raio do Circulo 2:");
				final double r2 = Double.parseDouble(sc.nextLine());
				
				System.out.println("Coordenada x do centro :");
				final double x2 = Double.parseDouble(sc.nextLine());
				
				System.out.println("Coordenada y do centro :");
				final double y2 = Double.parseDouble(sc.nextLine());
				
				final Ponto p2 = new Ponto(x2,y2);
				final Circulo c2 = new Circulo(r2,p2);
				
				if(c1.equals(c2)) {
					System.out.println("Sao iguais.");
				}
				else if(c1.inters(c2)) {
					System.out.println("Intersetam.");
				}
				else {
					System.out.println("Sao diferentes.");

				}
				break;

			}
		}while(choice!=5);
		sc.close();

	}

	
}
