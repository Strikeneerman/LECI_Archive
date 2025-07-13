package Aula3;
import java.util.Scanner;
public class EX3 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a;
        boolean primo = true;
        do{
            System.out.print("Insira um numero inteiro positivo: ");
            a = sc.nextInt();
            if(a<0){System.out.println("Numero inválido.");}
       
        }while(a<0);

        if(a <= 1){
            primo = false;
        }
        else{
            for(int i = 2;i < a; i++){
                if (a%i == 0){
                    primo = false;
                }
            }
        }

        if(primo){
            System.out.println("O número "+a+" é primo");
        }
        else{
            System.out.println("O número "+a+" não é primo");
        }
    }
}
