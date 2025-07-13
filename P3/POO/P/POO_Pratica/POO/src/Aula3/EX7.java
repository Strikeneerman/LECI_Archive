package Aula3;
import java.util.Scanner;
public class EX7 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String resposta;
        do{
        int num,certo,tentativa=0;
        
        System.out.print("Bem vindo ao AltoBaixo!\n");
        certo = (int)(100.0*Math.random())+1;
        do{
        System.out.print("Insira um numero de 1 a 100: ");
        num = sc.nextInt();
        if(num<certo){
            System.out.println("Numero demasiado baixo!");
        }
        else if(num>certo){
            System.out.println("Numero demasiado alto!");
        }
        tentativa++;
        }while(num != certo);
        System.out.println("Acertou!");
        System.out.println("Foram feitas "+tentativa+" tentativas!");
        System.out.print("Pretende continuar?(S ou Sim para continuar)");
        resposta = sc.next();
        }while(resposta.equals("Sim")||resposta.equals("S"));
    }
    
}
