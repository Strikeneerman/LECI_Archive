import java.util.Scanner;
public class Graus
{
	
	public static void main (String args[])
	{
	     Scanner sc = new Scanner(System.in);
	     double celsius;
	     double fahrenheit;
	     System.out.print("Graus em Celsius: ");
	     celsius = sc.nextDouble();
	     fahrenheit=1.8*celsius+32;
	     System.out.printf("%4.1f ºCelsius equivale a %4.1f ºFahrenheit", celsius, fahrenheit);
	}
}

