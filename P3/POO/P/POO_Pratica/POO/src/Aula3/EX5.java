package Aula3;
import java.util.Scanner;
public class EX5 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double mon,juro;
        do{
        System.out.print("Montante investido: ");
         mon = sc.nextDouble();
         if((mon < 0) || (mon%1000 != 0 )){
             System.out.println("Montante inválido, insira um numero positivo e multiplo de 1000");
         }
        }while( (mon < 0) || (mon%1000 != 0 ));
        
        do{
            System.out.print("Taxa de juro(entre 0% e 5%): ");
            juro = sc.nextDouble();
            if(juro <0 || juro >5 ){
                System.out.println("Valor inválido");
            }
        }while(juro <0 || juro >5 );

        for(int i=1; i<=12;i++){
            mon = mon + (mon * (juro/100));
            System.out.printf("Valor no mes %d é %1.2f \n",i,mon);
        }

    }
    
}
