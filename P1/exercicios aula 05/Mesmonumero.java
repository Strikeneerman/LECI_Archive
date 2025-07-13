import java.util.*;

public class Mesmonumero {
	
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		int x=0,y=0,num,n,vez=0;
		int Seq[]= new int[100];
		System.out.print("Insira o numero que pretendes contar: ");
		n = sc.nextInt();
		System.out.print("Insira uma sequencia de 100 numeros ou insira um numero negativo para terminar a sequencia mais cedo \n");
		do
		{
			num= sc.nextInt();
			Seq[x]=num;
			x++;
		}while(y<100 && num>0);
		for(x=0;x<100;x++)
		{
			if(Seq[x]== n){
			vez++;
			}
		}
		System.out.printf("O numero %d aparece %d vezes.",n,vez);
		
	}
}

