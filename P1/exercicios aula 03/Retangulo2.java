import java.util.Scanner;
public class Retangulo2 {
	
	public static void main (String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int lar,alt,i,j;
		System.out.print("Insira a altura: ");
		alt = ler.nextInt();
		System.out.print("Insira a largura: ");
		lar = ler.nextInt();
		for(i=0;i<alt;i++){
			if(i==0 || i== alt-1){
				for(j=0;j<lar;j++){
				
					System.out.print("*");
				
					}
				}
			else{
					System.out.print("*");
					for(j=1;j<lar-1;j++){
						
						System.out.print(" ");
						}
					System.out.print("*");
				}
				System.out.print("\n");
			}
	}
}

