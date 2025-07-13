import java.util.Scanner;
public class Numperfeito {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int Num;
		int i;
		int soma = 0;
		double Div;
		do{
			System.out.print("Insira um numero positivo: ");
			Num = sc.nextInt();
		}
		while (Num <= 0);
		
		for(i=1;i<Num;i++)
		{
			if(Num % i == 0)
			{		
				
				soma += i;
			}
		}
		if (Num == soma)
		{
				System.out.println (Num+ " e numero perfeito.");
		}
		else 
		{
			System.out.println (Num + " nao e numero perfeito.");
		} 		
	}
}

