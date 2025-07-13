import java.util.Scanner;
public class Retangulo {
	
	public static void main (String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int lar,alt,i,j;
		System.out.print("Insira a altura: ");
		alt = ler.nextInt();
		System.out.print("Insira a largura: ");
		lar = ler.nextInt();
		for(i=0;i<alt;i++){
			for(j=0;j<lar;j++){
				
				System.out.print("*");
				
				}
				System.out.printf("\n");
				
			}
	}
}

