import java.util.*;
import java.io.*;
public class Ex7_1_1 {
	
	public static void main (String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduza o nome do ficheiro: ");
		String nomein = sc.nextLine();
		File fichin = new File(nomein);
		Scanner fin= new Scanner(fichin);
		System.out.print("Output filename: ");
		String nameout= sc.nextLine();
		File fout = new File(nameout);
		PrintWriter pw = new PrintWriter(fout);
		System.out.print("Insira frase: ");
		String i= sc.nextLine();
		pw.println(i);
		while(fin.hasNextLine()) {
			pw.println(fin.nextLine());
		}
		fin.close();
		pw.close();
	}
}

