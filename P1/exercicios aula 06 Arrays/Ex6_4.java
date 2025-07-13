import java.util.*;
import java.io.*;
public class Ex6_4 {
	
	public static void main (String[] args) {
			Scanner sc = new Scanner(System.in);
			int[] notas;
			notas = notasInseridas();
			histograma(notas);
	}
	public static int[] notasInseridas()
	{

		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o numero de notas que pretende contar: ");
		int numero = sc.nextInt();
		while(numero<=0)
		{
				System.out.printf("Numero invalido, insira um numero inteiro positivo");
				numero = sc.nextInt();
		}
		int Notas[]= new int [numero];
		
		for(int i=0; i<Notas.length; i++)
		{
			System.out.print("Insira as notas(0 a 20)");
			int b = sc.nextInt();
			while(b < 0 || b > 20){
				System.out.printf("Entrada invalida, Insira uma nota de 0 a 20\n");
				b = sc.nextInt();
			}
			Notas[i] = b;
		}
		return Notas;
	}
	
	public static void histograma(int[] x)
	{
		System.out.print("\nHistograma de Notas");
		System.out.print("|n---------------------");
		for(int i=20,k=0;k<=20;k++,i--)
		{
			System.out.printf("\n%02d |  ",i);
			for( int j=0; j<estrelas(i, x);j++)
			{
				System.out.printf("*");
			}
		}
	}
	public static int estrelas(int a, int[] x)
	{ 	int n=0;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]==a)n++;
		}
		return n;
	}
}

