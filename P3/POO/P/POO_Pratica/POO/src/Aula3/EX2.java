package Aula3;
import java.util.Scanner;
public class EX2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int N ; 
        System.out.print("Valor: ");
        N = sc.nextInt();
        do{
            System.out.println(N);
            N--;

        }while(N!=-1);
    }
}
