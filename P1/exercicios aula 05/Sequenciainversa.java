import java.util.*;
public class Sequenciainversa {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int i,j;
		System.out.print("Quantos numeros tem a sequencia ?\n");
		n = sc.nextInt();
		int Num[]= new int[n];
		System.out.print("Insira a sequencia de numeros \n");
		for(i=0;i<Num.length;i++)
		{
			Num[i]= sc.nextInt();
		}
		for(i=n-1; i>=0; i--)
		{
			System.out.printf(" %d ",Num[i]);
		}	
	}
}

