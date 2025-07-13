package Aula4;
import java.util.Scanner;
public class Ex4 {
    public static Scanner sc = new Scanner(System.in);
    public static int ano;
    public static int mes;
    public static int dia;
    public static int diaSemana;
    public static String mesWord="";
    public static void main(String[] args){
        leituradevalores();
        dia = calculoDias(ano, mes);
        impressao(mesWord, diaSemana, dia, ano);


    }
    public static void leituradevalores(){
        System.out.print("Insira o ano: ");
        ano = sc.nextInt();

        do {System.out.print("Insira o mes(Janeiro = 1, Fevereiro = 2, ... Dezembro = 12): ");
		mes = sc.nextInt();} while ( mes <1 || mes >12);

        do {System.out.print("Insira o dia da semana(1 = Domingo,2 = Segunda,3 = Terça,4 = Quarta,5 = Quinta,6 = Sexta,7 = Sabado): ");
        diaSemana = sc.nextInt();} while(diaSemana<1||diaSemana>7);
    }
    public static int calculoDias(int ano,int mes){

        switch(mes){
            case 1: mesWord = "Janeiro";
                    dia=31;   
                    break;
            case 2: mesWord = "Fevereiro";
                    if (ano % 400 == 0)
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

            case 3: mesWord = "Março";
                    dia=31;   
                    break;
            case 4: mesWord = "Abril";
                    dia=30;   
                    break;
            case 5: mesWord = "Maio";
                    dia=31;   
                    break;
            case 6: mesWord = "Junho";
                    dia=30;   
                    break;
            case 7: mesWord = "Julho";
                    dia=31;   
                    break;
            case 8: mesWord = "Agosto";
                    dia=31;   
                    break;
            case 9: mesWord = "Setembro";
                    dia=30;   
                    break;
            case 10:mesWord = "Outubro";
                    dia=31;   
                    break;
            case 11:mesWord = "Novembro";
                    dia=30;   
                    break;
            case 12:mesWord = "Dezembro";
                    dia=31;   
                    break;
        }
        return dia;
    }
    public static void impressao(String mesWord, int diaSemana, int dia, int ano){
        System.out.println("   " + mesWord +" "+ ano +"     ");
        System.out.println(" Su Mo Tu We Th Fr Sa  ");
        int i;
        for (i=1;i<diaSemana;i++)
		{
			System.out.print("   ");
		}
		for (int j=1;j<=dia;j++)
		{
			if((i % 7) == 0)
			{
				System.out.printf(" %2d  \n ",j);
			}
			else 
			{
				System.out.printf("%2d ",j);
			}
			i++;
		}
		while((i % 7)!=0)
		{
			System.out.printf("   ");
			i++;
		}

    }
}
