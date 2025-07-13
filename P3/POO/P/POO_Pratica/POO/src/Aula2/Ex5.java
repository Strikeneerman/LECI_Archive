package Aula2;
import java.util.Scanner;
public class Ex5 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        Double v1,v2,d1,d2,vmedia,t1,t2;
        System.out.print("Velocidade 1(km/h): ");
        v1 = sc.nextDouble();
        System.out.print("Distancia percorrida(km): ");
        d1 = sc.nextDouble();
        System.out.print("Velocidade 2(km/h): ");
        v2 = sc.nextDouble();
        System.out.print("Distancia percorrida(km): ");
        d2 = sc.nextDouble();

        t1=d1/v1;
        t2=d2/v2;

        vmedia = (d2+d1)/(t2+t1);
        System.out.print("A velocidade media é "+ vmedia +" km/h");
    }
    

    
}
