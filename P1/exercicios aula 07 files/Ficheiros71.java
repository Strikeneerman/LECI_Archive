import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.*;

public class Ficheiros71 {
	
	public static void main (String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduza o nome do ficheiro ");
		String nome = sc.nextLine();
		boolean FileExis;
		boolean CanRead;
		File fin = new File(nome);
		do{
		Scanner fich = new Scanner(fin);
			while(fich.hasNextLine())
			{
				System.out.println(fich.nextLine());
			}
		}while (fin.isFile() && fin.canRead()) ;
		if (fin.isFile()){FileExis=true;}
		else {FileExis=false;}
		if (fin.canRead()){CanRead=true;}
		else {CanRead=false;}
		if (FileExis==false){System.out.printf("O ficheiro nao e valido");}
		if (CanRead==false){System.out.printf("Nao e possivel ler o ficheiro");}
		
		
		
	}
}

