package Aula2;
import java.util.Scanner;
public class Ex7 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ponto 1");
        System.out.print("Insira o x: ");
        double x1 = sc.nextDouble();
        System.out.print("Insira o y: ");
        double y1 = sc.nextDouble();
        System.out.println("Ponto 2");
        System.out.print("Insira o x: ");
        double x2 = sc.nextDouble();
        System.out.print("Insira o y: ");
        double y2 = sc.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("A distancia entre o ponto ("+x1+";"+y1+") e o ponto ("+x2+";"+y2+") é "+ distancia);
    }
}
