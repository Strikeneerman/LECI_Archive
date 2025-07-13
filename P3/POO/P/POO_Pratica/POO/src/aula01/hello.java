package aula01;
import java.util.Scanner;
public class hello {
    public static void main(String[] args) {
        int b=0;
        int c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("hey there!");
        int a = 2;
        while(a > 0){
            System.out.println("Place number: \n");
            b = sc.nextInt();
            c += b;
            a--;
        }
        System.out.println(c);
        System.out.println("done!");
        sc.close();
        

    }
}
