import java.util.Scanner;

public class Tempo
{
	public static void main (String args[]) 
	{ 
		Scanner sc = new Scanner(System.in);
		int segundos;
		int hora, minuto ,segundo, minutos;
		System.out.print("Tempo em segundos: ");
		segundos = sc.nextInt();
		hora=segundos/(60*60);
		minutos=segundos/60;
		minuto=minutos-(hora*60); 
		segundo=segundos-(hora*60*60);
		System.out.printf("Horas: %2d:%02d:%2d\n", hora,minuto,segundo);
	}
}

