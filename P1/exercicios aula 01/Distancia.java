import java.util.Scanner;
public class Distancia {
	
	public static void main (String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		double x1, x2, y1, y2;
		double lon,lat,distancia;
		System.out.print("Insire a longitude da localidade A: ");
		x1 = sc.nextDouble();
		System.out.print("Insire a latitude da localidade A: ");
		y1 = sc.nextDouble();
		System.out.print("Insire a longitude da localidade B: ");
	    x2 = sc.nextDouble();
	    System.out.print("Insire a latitude da localidade A: ");
	    y2 = sc.nextDouble();
	    lon = Math.pow(x2 - x1,2);
	    lat = Math.pow(y2 - y1,2);
	    distancia = Math.sqrt(lon + lat);
	    distancia = distancia*100; 
	    System.out.printf("A distancia entre localidade A e a B e %6.2f km.\n",distancia);	
	}
}

