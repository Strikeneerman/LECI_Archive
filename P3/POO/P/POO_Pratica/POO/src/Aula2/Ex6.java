package Aula2;
import java.util.Scanner;
public class Ex6 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
           System.out.print("Insira o tempo(segundos): ");
           int temp = sc.nextInt();
           int h = temp/3600;
           int res = temp%3600;
           int min = res/60;
           int seg = res%60;
           System.out.println("Tempo(hh/mm/ss): "+h+":"+min+":"+seg);




    }
}
