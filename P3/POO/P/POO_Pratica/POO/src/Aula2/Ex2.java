package Aula2;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double Cel = 0.0;
        System.out.print("Temperatura em Celsius: ");
        Cel = sc.nextDouble();
        Double Fahr = 1.8*Cel + 32;
        System.out.println("A temperatura em Fahrenheit é: "+ Fahr);
        sc.close();
    }
}
