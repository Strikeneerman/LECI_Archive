package Aula5;
import java.util.Scanner;
public class Ex1 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    int choice;
    Date data = new Date(0,0,0);

    do {
        
         do {
            System.out.println("Date operations: ");
            System.out.println("1 - create new date");
            System.out.println("2 - show current date");
            System.out.println("3 - increment date");
            System.out.println("4 - decrement date");
            System.out.println("0 - exit");
            System.out.print("Input: ");
            choice = sc.nextInt();
            if(choice <0 || choice >4){
                System.out.println("Valor não é válido.");
            }
        } while (choice <0 || choice >4); 
     
     switch (choice){
        case 1: 
            criarData(data);
            break;
        case 2:
            System.out.println(data);
            break;
        case 3:
            data.increment();
            break;
        case 4:
            data.decrement(); 
            break;
        case 0:
            break;

     }
    } while (choice != 0);   
    }
    public static void criarData(Date data){
        int dia, mes, ano;
        System.out.print("dia: ");
        dia = sc.nextInt();
        System.out.print("mes: ");
        mes = sc.nextInt();
        System.out.print("ano: ");
        ano = sc.nextInt();
        data.set(dia,mes,ano);
      
    }

}
