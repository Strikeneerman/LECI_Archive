package Aula2;
import java.util.Scanner;
public class Ex8 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Cateto A: ");
        Double catA = sc.nextDouble();
        System.out.print("Cateto B: ");
        Double catB = sc.nextDouble();
        Double hip = Math.sqrt(Math.pow(catA,2)+Math.pow(catB,2));
        Double ang = Math.toDegrees(Math.acos(catA/hip));
        System.out.println("O valor da hipotenusa é "+hip+"que faz um angulo de "+ang+"º com o cateto A");
    }
}
