package Aula3;
import java.util.Scanner;

public class EX1 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
    Double notaT,notaP,notaF;
    System.out.print("Nota teorica: ");
    notaT = sc.nextDouble();
    System.out.print("Nota pratica: ");
    notaP = sc.nextDouble();
    if(notaT>=0 && notaT<=20 && notaP>=0 && notaP<=20){
         if(notaT < 7.0 || notaP <7){
             System.out.print("66");
         }
         else{
             notaF = notaT*0.4 + notaP*0.6;
             System.out.printf("Nota final: %2.0f",notaF);
         }
    }
    else{
        System.out.println("Valor inválido");
    }  
    }
}
