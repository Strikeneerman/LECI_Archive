import java.util.Scanner;

public class Nota {
	
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		
		double TPG1, TPG2, EI;
		double nota;
		
		System.out.print("Introduza a nota do primeiro teste de grupo pratico: ");
		TPG1 = ler.nextDouble();
		System.out.print("Introduza a nota do segundo teste de grupo pratico: ");
		TPG2 = ler.nextDouble();
		System.out.print("Introduza a nota do teste pratico individual: ");
		EI = ler.nextDouble();
		nota = ((TPG1*0.2)+(TPG2*0.3)+(EI*0.5));
		if (nota>=9.5){
			System.out.printf("Aluno aprovado \n");
			}
		else {
			System.out.printf("Aluno reprovado \n");}
	}
}

