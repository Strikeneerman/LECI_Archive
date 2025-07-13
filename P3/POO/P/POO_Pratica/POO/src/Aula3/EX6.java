package Aula3;
import java.util.Scanner;
public class EX6 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int ano, dia=0, mes;
        do{
        System.out.print("Insira o mes(Janeiro = 1, Fevereiro = 2, ... Dezembro = 12): ");
        mes = sc.nextInt();
        }while(mes<1 || mes >12);
        System.out.print("Insira o ano: ");
        ano = sc.nextInt();
        switch(mes){
            case 1: 
                    dia=31;   
                    break;
            case 2: if (ano % 400 == 0)
                        {
                        dia = 29;
                        }
                    else if ((ano %4 ==0 ) && (ano % 100 != 0))
                        {
                        dia = 29;
                        }
                    else 
                    {
                        dia = 28;
                    }
            break;

            case 3: dia=31;   
                    break;
            case 4: dia=30;   
                    break;
            case 5: dia=31;   
                    break;
            case 6: dia=30;   
                    break;
            case 7: dia=31;   
                    break;
            case 8: dia=31;   
                    break;
            case 9: dia=30;   
                    break;
            case 10:dia=31;   
                    break;
            case 11:dia=30;   
                    break;
            case 12:dia=31;   
                    break;
        }

        System.out.println("O mes "+ mes +" do ano "+ano+" tem "+dia+" dias");
    }
}
