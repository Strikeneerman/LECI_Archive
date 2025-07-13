import java.util.Scanner;

public class Datas {
	
	public static void main (String args[]) 
	{
		Scanner ler =new Scanner(System.in);
		int ano;
		int mes;
		int dia=0;
		System.out.print("Introduza o ano: ");
		ano = ler.nextInt();
		System.out.println();
		System.out.printf ("Introduza o mes (de 1 a 12): ");
		mes = ler.nextInt();
		System.out.println();
		if ((mes==1) || (mes==3) || (mes==5) || (mes==7) || (mes==8) || (mes==10) || (mes==12) )
		{
			dia = 31;
		}
		else if ((mes==4) || (mes==6) || (mes==9) || (mes==11))
		{
			dia = 30;
		}
		else if (mes==2)
		{
			if ((ano%4)==0)
			{
				if ((ano%100)==0)
				{
					if ((ano%400)==0)
					{
						dia=29;
					}
					else
					{
						dia=28;
					}
				}
				else
				{
					dia=29;
				}
			}
			else 
			{
				dia=28;
			}
		}
		System.out.println("O mes "+ mes +" do ano "+ ano +" tem "+ dia +" dias.");	
	}
}


