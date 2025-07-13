package Aula2;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Montante investido(Euros): ");
        Double inves = sc.nextDouble();
        System.out.print("Taxa de juro(%): ");
        Double taxa = sc.nextDouble();
        do{
            inves = inves + (inves * (taxa/100));
            n++;
        }while(n<3);
        Double ValTotal = inves;
        
        System.out.println("O montante ao fim de 3 meses é: "+ValTotal+"Euros");
        sc.close();
        
    }

    
}
