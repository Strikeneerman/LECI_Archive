package Aula2;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira uma distância em quilómetros: ");
        Double a = sc.nextDouble();
        
        Double milha = a / 1.609;
        System.out.println("O valor em milhas é " + milha);
        sc.close();
    }
    
}
