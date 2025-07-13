import java.util.Scanner;
public class Inicialigual
{
	
	public static void main (String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		double inicial, num=0, media,soma=0;
		int elementos=0;
		System.out.print("Introduza uma lista de numeros (termina quando colocar novamente o primeiro numero): ");
		inicial = ler.nextDouble();
		double min=inicial, max=inicial;
		while(num != inicial)
		{
				System.out.print("");
				num = ler.nextDouble();
				if (num>max && num !=inicial)
				{
					max=num;
				}
				else if (num < min && num != inicial)
				{
					min=num;
				}
			if(num!=inicial)
			{
			soma = soma+num;
			elementos++;
			}
		}
		media=soma/elementos;
		System.out.printf("Valor maximo: %4.3f %n",max);
		System.out.printf("Valor minimo: %4.3f %n",min);
		System.out.printf("Media: %4.3f %n",media);
		System.out.printf("Numero de elementos: %d %n",elementos);
	}
}


