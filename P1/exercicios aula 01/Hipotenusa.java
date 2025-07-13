import java.util.Scanner;
public class Hipotenusa {
	
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double catetoA, catetoB;
		double hipotenusa,angulo;
		System.out.print("Insira o valor do primeiro cateto: ");
		catetoA = sc.nextDouble();
		System.out.print("Insira o valor do segundo cateto: ");
		catetoB = sc.nextDouble(); 
		hipotenusa =Math.sqrt(Math.pow(catetoA,2) + Math.pow(catetoB,2));
		angulo = Math.toDegrees(Math.atan(hipotenusa/catetoA));
		System.out.printf("O valor da hipotenusa e %6.2f e o valor do angulo entre o cateto a e a hipotenusa e %6.2f\n",hipotenusa,angulo);	
	}
}

