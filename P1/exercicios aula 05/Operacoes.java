import java.util.*;
public class Operacoes {
	static		Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {

		int nElem=0;
		int operacao=0;
		int Seq[]= new int[50];
	do {	
		System.out.println("O que pretende fazer?");
		System.out.println("1-Ler a sequência");
		System.out.println("2-Escrever a sequência");
		System.out.println("3-Calcular o maximo da sequencia");
		System.out.println("4-Calcular o minimo da sequencia");
		System.out.println("5-Calcular a media da sequencia");
		System.out.println("6-Detetar se e uma sequência so constituida por numeros pares");
		System.out.println("10-Terminar o programa");
		operacao=sc.nextInt();
			switch (operacao){
				case 1:
					nElem = lerSequencia(Seq);
					break;
				case 2:
					imprimir(Seq, nElem);
					break;
				case 3:
					nMaximo(Seq, nElem);
					break;
				case 4:
				case 5:
				case 6:
				case 10:System.out.printf("Operacao terminada");
					break;
				default:
					System.out.println("Opcao invalida!");
			}
		} while (operacao != 10);
	}
	public static int lerSequencia(int i[])
	{
		int x=0,num;
		System.out.print("Insira uma sequencia de 50 numeros ou insira 0 para terminar a sequencia mais cedo \n");
		do
		{
			num= sc.nextInt();
			i[x]=num;
			x++;
		}while(x <i.length && num>0);
		
		return x;
	}
	public static void imprimir(int[] a, int n){
		for (int i=0;i<n;i++)System.out.println(a[i]);
		}
	public static void nMaximo(int[] a, int n)
	{
		int z=0;
		for (int i=0;i<n;i++)
		{
			if (a[i+1]>a[i])
			{
				 z=a[i+1];
			}
		}
		System.out.printf("O maximo e %d \n",z);
	}
}

