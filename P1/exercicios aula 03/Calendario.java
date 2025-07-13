import java.util.Scanner;
public class Calendario {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int ano, diaSem, mes;
		int dia=0;
		int i,j;
		String Mes="";
		do{
		System.out.print("Insira o mes: January = 1, February = 2, ... December = 12\n");
		mes = sc.nextInt();} while ( mes <1 || mes >12);
		System.out.print("Insira o ano: ");
		ano = sc.nextInt();
		do{
		System.out.print("Insira o dia da semana: Sunday = 1, Monday = 2, ... ,Saturday = 7\n");
		diaSem = sc.nextInt();} while (diaSem <1 || diaSem>7);
		switch (mes){
			case 1:     Mes = "January";
						dia = 31;
						break;
			case 2: 	Mes = "February";
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
			case 3:     Mes = "March";
						dia = 31;
						break;
			case 4: 	Mes = "April";
						dia = 30;
						break;
			case 5:     Mes = "May";
						dia = 31;
						break;
			case 6: 	Mes = "June";
						dia = 30;
						break;
			case 7:   	Mes = "July";
						dia = 31;
						break;
			case 8: 	Mes = "August";
						dia = 31;
						break;
			case 9:   	Mes = "September";
						dia = 30;
						break;
			case 10: 	Mes = "October";
						dia = 31;
						break;
			case 11: 	Mes = "November";
						dia = 30;
						break;
			case 12:  	Mes = "December";
						dia = 31;
						break;
		}
		System.out.printf("----------------------\n");
		System.out.println("|   " + Mes +" "+ ano +"    |");
		System.out.printf("----------------------\n");
		System.out.printf("| Su Mo Tu We Th Fr Sa |\n");
		System.out.printf("----------------------\n|");
		for (i=1;i<diaSem;i++)
		{
			System.out.printf("  ");
		}
		for (j=1;j<=dia;j++)
		{
			if(((i % 7) == 0))
			{
				System.out.printf(" %2d 
				|\n|",j);
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
		System.out.printf("|\n|----------------------|");
		
		
		
		
	}
}

