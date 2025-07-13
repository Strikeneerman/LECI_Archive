package Aula5;
import java.util.Scanner;
public class Ex2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    Calendario calend = new Calendario(0,0);
    int choice,month;

    do {
        
         do {
            System.out.println("Calendar operations: ");
            System.out.println("1 - create new calendar");
            System.out.println("2 - print calendar month");
            System.out.println("3 - calendar");
            System.out.println("0 - exit");
            System.out.print("Input: ");
            choice = sc.nextInt();
            if(choice <0 || choice >3){
                System.out.println("Valor não é válido.");
            }
        } while (choice <0 || choice >3); 
     
     switch (choice){
        case 1: criarCalendario(calend);
            break;
        case 2: System.out.print("Insira o mes(Janeiro = 1, Fevereiro = 2, ... Dezembro = 12): ");
                month = sc.nextInt();
                calend.printMonth(month);
            break;
        case 3: for(int i = 1; i<=12;i++){
                calend.printMonth(i);   
                }
            break; 
        case 0:
            break;

     }
    } while (choice != 0);   
    }

    public static void criarCalendario(Calendario calend){
        int primeirodia, ano;
        System.out.print("Ano: ");
        ano = sc.nextInt();
        System.out.print("Primeiro dia da semana do ano(1 = Domingo,2 = Segunda,3 = Terça,4 = Quarta,5 = Quinta,6 = Sexta,7 = Sabado):");
        primeirodia = sc.nextInt();
        calend.set(ano,primeirodia);
      
    }
    
}
