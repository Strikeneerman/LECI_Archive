import java.util.*;
public class Operacoes {
	static		Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {

		int nElem=0;
		int operacao=0;
		int Seq[]= new int[50];
	do {	
		System.out.println("O que pretende fazer?");
		System.out.println("1-Ler a sequencia");
		System.out.println("2-Escrever a sequencia");
		System.out.println("3-Calcular o maximo da sequencia");
		System.out.println("4-Calcular o minimo da sequencia");
		System.out.println("5-Calcular a media da sequencia");
		System.out.println("6-Detetar se e uma sequencia so constituida por numeros pares");
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
					nMinimo(Seq);
					break;
				case 5:
					Media(Seq, nElem);
					break;
				case 6:
					Par(Seq, nElem);
					break;
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
			if(num==0){break;}
			i[x]=num;
			x++;
		}while(x <i.length && num>0);
		
		return x;
	}
	public static void imprimir(int[] a,int n){
		for (int i=0;i<n;i++)System.out.println(a[i]);
		}
	public static void nMaximo(int[] a, int n)
	{
		int max=a[0];
		for (int i=1;i<n;i++)
		{
			if (a[i]>max)
			{
				 max=a[i];
			}
		}
		System.out.printf("O maximo e %d \n",max);
	}
	public static void nMinimo(int[] a)
	{
		int min=a[0];
		for (int i=1;i<a.length;i++)
		{
			if (a[i]<min && a[i]!=0){min=a[i];}
		}
		System.out.printf("O minimo e %d \n",min);
	}
	public static void Media(int[] a, int n)
	{
		int soma=0;
		for (int i=0;i<n;i++){soma += a[i];}
		System.out.printf("A soma e %d \n",soma);
		float media= (float)soma/n;
		System.out.printf("A media e %4.1f",media);	
	}
	public static void Par(int[] a, int n)
	{
		boolean par;
		for (int i=0;i<n;i++)
		{
			if( (a[i]%2) == 0)
			{par = true;}
			else if ((a[i]%2) != 0){ par = false;}
		}
		if (par = false){
		System.out.printf("Existem numeros impares \n");}
		else if (par = false){System.out.printf("Todos os numeros sao pares \n");}
	}
}

