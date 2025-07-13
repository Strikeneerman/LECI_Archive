package Aula3;
import java.util.Scanner;
public class EX4 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double primeiro, num, max, min, media, soma, i=1;
        System.out.print("Insira um conjunto de numeros reais(termina quando inserido o primeiro valor novamente): ");
        primeiro = sc.nextDouble();
        max = primeiro;
        min = primeiro;
        soma = primeiro;

        do{
            num = sc.nextDouble();
            if(max<num){ max = num;}
            else if(min>num) {min = num;}
            soma += num;
            i++;
        }while(num != primeiro);

        media = soma/i;

        System.out.println("Valor máximo: "+ max);
        System.out.println("Valor minimo: "+ min);
        System.out.println("Soma: "+soma);
        System.out.printf("Média: %1.2f\n",media);
        System.out.println("Foram lidos "+i+" numeros");
    }
}
