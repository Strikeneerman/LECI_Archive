import java.io.File;

public class ArquivosJava{
	
	public static void main (String[] args){
		
		//criação de um novo ficheiro de texto
		String nome_ficheiro = "C:" + File.separator + "lixo" 
									+ File.separator + "teste.txt";
		File ficheiro = new File(nome_ficheiro);
		try{
			ficheiro.createNewFile();
		}
		catch(Exception e)
		{
			System.out.println("Erro! " + ficheiro.getPath());
		}
		
		//determinar a existencia de um determinado ficheiro//
		//System.out.println(nome_ficheiro + " existe? " + ficheiro.exists());
		//boolean existe = ficheiro.exists();
		//if(existe){
			//System.out.println("O ficheiro existe.");
			//}
		//else{
			//System.out.println("O ficheiro nao existe");
			//}
		//codigo para eliminar ficheiro
		//if(existe){
			// eliminação do ficheiro
			//ficheiro.delete();
			//System.out.println("Ficheiro " + ficheiro.getPath() + " foi eliminado com sucesso");
			//}
	}
}

