package aula1;

import java.util.*;

public class prob2 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int choice;
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		do {
			System.out.println("1 - Adicionar Pessoa");
			System.out.println("2 - Apagar Pessoa");
			System.out.println("3 - Apresentar lista de Pessoas");
			System.out.println("4 - Ordenar lista por nome");
			System.out.println("5 - Ordenar lista por cc");
			System.out.println("6 - Sair");
			System.out.print("Escolha uma opcao: ");
			
			choice = Integer.parseInt(sc.nextLine());
			System.out.println();
			
			
			
			switch(choice) {
			case 1:
				System.out.println("Nome:");
				String nome = sc.nextLine();
				
				System.out.println("CC :");
				int cc = Integer.parseInt(sc.nextLine());
				
				System.out.println("Data de nascimento(dd-mm-yyyy) :");
				String indata = sc.nextLine();
				String[] outdata = indata.split("-");
				if(outdata.length != 3) throw new IllegalArgumentException("data invalida");
				Data dataNasc = new Data(Integer.parseInt(outdata[0]),Integer.parseInt(outdata[1]),Integer.parseInt(outdata[2]));
				Pessoa p = new Pessoa(nome,cc,dataNasc);
				pessoas.add(p); 
				break;
				
			case 2:
				System.out.print("Insira o nome da pessoa que pretende apagar: ");
				String delete = sc.nextLine();
				
				for (Pessoa person:pessoas) {
				    if (person.getnome().equals(delete) ) {
				       pessoas.remove(delete);			/*Nao percebi porque não funciona. 
				       									Se poder explicar na aula prática agradecia.*/
				    }
				 }
			    break;
			    
			case 3:
				System.out.println("Lista de pessoas:\n");
				for(Pessoa person:pessoas)
				{
					System.out.println(person.toString());
					
				}
				break;
				
			case 4:
				System.out.print("Lista de pessoas ordenadas por nome:\n");
				   Collections.sort(pessoas, Pessoa.nomeComp);

				   for(Pessoa pe: pessoas){
						System.out.println(pe);
				   }
				
				break;
			case 5:
				System.out.println("Lista de pessoas ordenadas por cc:\n");
				   Collections.sort(pessoas, Pessoa.ccComp);
				   for(Pessoa pe: pessoas){
						System.out.println(pe);
				   }
				break;
			}
			
		}while (choice !=6);
	}

}
