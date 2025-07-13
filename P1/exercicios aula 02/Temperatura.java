import java.util.Scanner;
public class Temperatura 
{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char temp;
		double Temp, Fah, Cel;
		System.out.print("Pretende introduzir a temperatura em Celsius (prima 0) ou em Fahrenheit (prima 1): ");
		temp = sc.nextLine().charAt(0);
		System.out.printf("Insira a temperatura: ");
		Temp = sc.nextDouble();		
		switch(temp){
			case '1':
						Cel=(Temp-32)/1.8;
						System.out.printf("%4.1f ºFahrenheit e equivalente a %4.1f ºCelsius",Temp,Cel);
						break;
			
			case '0':
						Fah=1.8*Temp+32.0;
						System.out.printf("%4.1f ºCelsius e equivalente a %4.1f ºFahrenheit",Temp,Fah);
						break;
			}
		
		
	}
}

