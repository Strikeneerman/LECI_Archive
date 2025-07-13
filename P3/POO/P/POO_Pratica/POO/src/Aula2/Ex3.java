package Aula2;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Double tmpIni,tmpFin,Agua,Q;
        System.out.println("Quantidade de agua(kg): ");
        Agua = sc.nextDouble();
        System.out.println("Temperatura inicial(Celsius): ");
        tmpIni = sc.nextDouble();
        System.out.println("Temperatura final(Celsius): ");
        tmpFin = sc.nextDouble();

        Q = Agua*(tmpFin-tmpIni)*4184;

        System.out.println("A energia necessária é "+Q+ "Joules");
        sc.close(); 
    }
}
