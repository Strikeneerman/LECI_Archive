import java.util.Scanner;
import java.io.*;
public class Exercicio5_3 
{
	public static void main (String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		String file1=""; String file2="";
		if (args.length!=2)
		{
			System.out.println("Dado que os argumentos quando executou o programa nao estavam corretos, insira o primeiro ");
			file1=sc.nextLine();
			while (file1.isEmpty())
				file1=sc.nextLine();
			System.out.print("Insira o segundo ficheiro:");
			file2=sc.nextLine();
			while(file2.isEmpty())
					file2=sc.nextLine();
		}
		else 
		{
			assert(!args[0].isEmpty());
			assert(!args[1].isEmpty());
			file1=args[0];
			file2=args[1];
		}
		File in= new File(file1);
		while (!in.exists() || !in.canRead() || in.isDirectory())   //bloco de confirmacao do primeiro ficheiro
		{
			System.out.println("Algo de errado correu com o ficheiro que vai copiar, reinsira:");
			file1=sc.nextLine();
			while(file1.isEmpty())
				file1=sc.nextLine();
			in=new File(file1);
		 }

		File out= new File(file2);
		if (out.exists())
		{
			System.out.println("O ficheiro que inseriu ja existe, aceita em dar overwrite? Y/n");
			String answer= sc.nextLine();
			while (answer.isEmpty())
			{
				answer=sc.nextLine();
			}
			if (answer.compareTo("n")==0)
			{
				System.out.println("Insira o segundo ficheiro:");
				file2=sc.nextLine();
				while(file2.isEmpty())
					file2=sc.nextLine();
				out=new File(file2);
			}
		}
		Scanner fich1 = new Scanner (in);
		PrintWriter fich2= new PrintWriter(out);
		while (fich1.hasNextLine())
		{
			String linha= fich1.nextLine();
			fich2.println(linha);
		}
		fich2.close();
		fich1.close();
	}
}

