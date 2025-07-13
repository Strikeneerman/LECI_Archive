import java.io.*;
import java.util.*;
public class Ex7_1 {
	
	public static void main (String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o nome: ");
		String nome = sc.nextLine();
		File fin = new File(nome);
		do{
		if(fin.isFile()){ System.out.printf("O ficheiro existe\n");}
		else if (!fin.isFile()){System.out.printf("O ficheiro não existe");
								System.exit(1);
								}
		}while(!fin.isFile());
		if (fin.canRead()) {System.out.printf("Tem permissão\n");}
		else if (!fin.canRead())  {System.out.printf("Não tem permissão\n");
								System.exit(2);
								}
		
		Scanner fich = new Scanner(fin);
		while(fich.hasNextLine())
		{
			String line= fich.nextLine();
			System.out.println(line);
		}
		
		fich.close();
	}
}

