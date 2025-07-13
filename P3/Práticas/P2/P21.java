
import java.util.*;

public class P21 {

	public static void main(String[] args) {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();		
		ArrayList<Video> videos = new ArrayList<Video>();
		
		final int N = 3;
		Scanner sc = new Scanner(System.in);
		int escolha;
		do{
			System.out.println();
			System.out.println("-----UTILIZADOR-----");
			System.out.println("1:NOVO FUNCIONARIO");
			System.out.println("2:NOVO ALUNO");
			System.out.println("3:REMOVER");
			System.out.println("4:LISTAR VIDEOS PARA ESTE UTILIZADOR");
			System.out.println("-------VIDEOS------");
			System.out.println("5:ADICIONAR");
			System.out.println("6:REMOVER");
			System.out.println("7:VERIFICAR DISPONIBILIDADE");
			System.out.println("8:EMPRESTIMO");
			System.out.println("9:DEVOLUCAO");
			System.out.println("10:LISTAR RATINGS");
			System.out.println("11:LISTAR HISTORICO DE EMPRESTIMOS");
			System.out.println("0:TERMINAR");
			System.out.print("Escolha:");
			escolha = Integer.parseInt(sc.nextLine());
			System.out.println();
			
			switch(escolha){
				case 1: //funcionario
					System.out.println("Nome?");
					String name = sc.nextLine();					
	
					System.out.println("CC?");
					int cc = Integer.parseInt(sc.nextLine());
					
					for(int i = 0; i<clientes.size(); i++) {
						if(clientes.get(i).getcc() == cc) {
							throw new IllegalArgumentException("Pessoa ja existe.");
						}
					}
					System.out.println("Data de nascimento? [dd/mm/aaaa]");
					String nasc_date = sc.nextLine();
					String[] data_nasc = nasc_date.split("/");
					Data dnasc = new Data(Integer.parseInt(data_nasc[0]), Integer.parseInt(data_nasc[1]), Integer.parseInt(data_nasc[2]));
					
					System.out.println("NUMERO FUNCIONARIO?");
					int nfunc = Integer.parseInt(sc.nextLine());
					
					System.out.println("NUMERO FISCAL?");
					int nfiscal = Integer.parseInt(sc.nextLine());
					
				    Cliente funcionario = new Cliente(name, cc, dnasc, nfunc, nfiscal);
				    clientes.add(funcionario);
					
					break;
					
				case 2: //estudante	
					System.out.println("Nome?");
					String name_s = sc.nextLine();					
	
					System.out.println("CC?");
					int cc_s = Integer.parseInt(sc.nextLine());
					
					for(int i = 0; i<clientes.size(); i++) {
						if(clientes.get(i).getcc() == cc_s) {
							throw new IllegalArgumentException("Pessoa ja existe.");
						}
					}
					
					System.out.println("Data de nascimento? [dd/mm/aaaa]");
					String nasc_date_s = sc.nextLine();
					String[] data_nasc_s = nasc_date_s.split("/");
					Data dnasc_s = new Data(Integer.parseInt(data_nasc_s[0]), Integer.parseInt(data_nasc_s[1]), Integer.parseInt(data_nasc_s[2]));
					
					System.out.println("NUMERO MECANOGRAFICO?");
					int nummec = Integer.parseInt(sc.nextLine());
					
					System.out.println("CURSO?");
					String curso = sc.nextLine();
					
					Cliente estudante = new Cliente(name_s, cc_s, dnasc_s, nummec, curso);
					clientes.add(estudante);
					break;
					
				case 3:
					System.out.println("Numero de socio de quem retirar");
					int ns_remove = Integer.parseInt(sc.nextLine());
					boolean person_in_list = false;
					
					for(int i = 0; i<clientes.size(); i++) {
						if(clientes.get(i).getnsocio() == ns_remove) {
							clientes.remove(i);
							person_in_list = true;
							System.out.println("Pessoa removida com sucesso.");
						}
					}
					
					if(!person_in_list) {
						System.out.println("Numero de socio não existe.");
					}
					System.out.println();
					break;
					
				case 4: //listagem de videos para determinado utilizador
					System.out.println("ID DE SOCIO");
					int id = Integer.parseInt(sc.nextLine());
					boolean socio_in_list = false;
					
					for(int i = 0; i<clientes.size(); i++) {
						if(clientes.get(i).getnsocio() == id) {
							socio_in_list = true;
						}
					}
					
					if(!socio_in_list) {
						System.out.println("Numero de socio nao existe.");
					}
					else {
						for(int i = 0; i<videos.size(); i++) {
							String idade = videos.get(i).getidade();
							boolean disponivel = !(videos.get(i).isOwned());
							
							if(idade.equals("ALL") && disponivel) {
								System.out.println("O "+videos.get(i).toString()+" esta disponivel.");
							}
							else if(idade.equals("M6") && (clientes.get(id-1).getage() > 6) && disponivel) {
								System.out.println("O "+videos.get(i).toString()+" esta disponivel.");

							}
							else if(idade.equals("M12") && (clientes.get(id-1).getage() > 12) && disponivel) {
								System.out.println("O "+videos.get(i).toString()+" esta disponivel.");

							}
							else if(idade.equals("M16") && (clientes.get(id-1).getage() > 16) && disponivel) {
								System.out.println("O "+videos.get(i).toString()+" esta disponivel.");

							}
							else if(idade.equals("M18") && (clientes.get(id-1).getage() > 18) && disponivel) {
								System.out.println("O "+videos.get(i).toString()+" esta disponivel.");

							}
							else {
								System.out.println("Nao ha filmes disponiveis.");
							}
						}
					}						
					break;
					
				case 5:
					System.out.println("Titulo do video?");
					String title = sc.nextLine();	
					
					for(int i = 0; i<videos.size(); i++) {
						if(videos.get(i).gettitle().equals(title)) {
							throw new IllegalArgumentException("Filme ja existe.");
						}
					}
	
					System.out.println("Categoria? [Acao,Comedia,Infantil,Drama,etc]");
					String categ = sc.nextLine();
					
					System.out.println("Idade? [ALL, M6, M12, M16, M18]");
					String idade = sc.nextLine();					
					
					Video novo = new Video(title,categ,idade);
					videos.add(novo);
				break;
				
				case 6:
					System.out.println("ID do video que quer retirar");
					int id_remove = Integer.parseInt(sc.nextLine());
					boolean video_in_list = false;
					
					for(int i = 0; i<videos.size(); i++) {
						if(videos.get(i).getid() == id_remove) {
							videos.remove(i);
							video_in_list = true;
							System.out.println("Video removido com sucesso.");
						}
					}
					
					if(!video_in_list) {
						System.out.println("ID de filme nao existe.");
					}
					System.out.println();
					break;
					
				case 7:
					System.out.println("Nome do filme para verificar a disponbilidade");
					String filme_verif = sc.nextLine();
					boolean filme_in_list = false;
					int id_filme = 0;
					
					//1 verificar se existe o filme
					for(int i = 0; i<videos.size(); i++) {
						if(videos.get(i).gettitle().equals(filme_verif)) {
							filme_in_list = true;
							id_filme = i;
						}
					}
					//2 verificar se o filme esta emprestado
					if(filme_in_list) {
						if(videos.get(id_filme).isOwned()) {
							System.out.println("O filme estao emprestado, volte mais tarde.");
						}
						else {
							System.out.println("O filme esta disponivel!");
						}
					}
					else {
						System.out.println("O filme nao existe.");
					}
					
					break;
					
				case 8:	
					System.out.println("Numero de socio para efetuar emprestimo");
					int no_socio = Integer.parseInt(sc.nextLine());
					boolean socio_exists = false;
					
					for(int i = 0; i<clientes.size(); i++) {
						if(clientes.get(i).getnsocio() == no_socio) {
							socio_exists = true;
						}
					}
					
					if(!socio_exists) {
						System.out.println("Numero de socio não existe.");
					}
					else if(clientes.get(no_socio-1).num_emprestimos() >= N) {
						System.out.println("Atingiu o limite de emprestimos.");
					}
					else {
						System.out.println("ID de video para emprestar");
						int id_emprest = Integer.parseInt(sc.nextLine());					
						boolean video_exists = false;
						
						for(int i = 0; i<videos.size(); i++) {
							if(videos.get(i).getid() == id_emprest) {
								video_exists = true;
							}
						}					
						if(!video_exists) {
							System.out.println("ID de video não existe.");
						}
						else {
							clientes.get(no_socio-1).emprestimo(videos.get(id_emprest-1));
							videos.get(id_emprest-1).setOwned(true);	
							System.out.println("Filme emprestado com sucesso!");
						}
					}				
					break;
					
				case 9:	
					System.out.println("Numero de socio para efetuar devolucao");
					int num_socio = Integer.parseInt(sc.nextLine());
					boolean socio_exist = false;
					
					for(int i = 0; i<clientes.size(); i++) {
						if(clientes.get(i).getnsocio() == num_socio) {
							socio_exist = true;
						}
					}
					
					if(!socio_exist) {
						System.out.println("Numero de socio nao existe.");
					}
					
					System.out.println("ID de video para efetuar devolucao");
					int id_emp = Integer.parseInt(sc.nextLine());					
					boolean video_exist = false;
					
					for(int i = 0; i<videos.size(); i++) {
						if(videos.get(i).getid() == id_emp) {
							video_exist = true;
						}
					}					
					if(!video_exist) {
						System.out.println("ID de video nao existe.");
					}
					else {
						clientes.get(num_socio-1).removemprest(videos.get(id_emp-1));
						videos.get(id_emp-1).setOwned(false);	
						System.out.println("Rating que atribui ao filme? [1-10]");
						int rating = Integer.parseInt(sc.nextLine());
						videos.get(id_emp-1).setRating(rating);	
						System.out.println("Filme devolvido com sucesso!");
					}
					break;
					
				case 10:
					for(int i = 0; i<videos.size(); i++) {
						System.out.println(videos.get(i).toStringRating());
					}
					break;
					
				case 11:
					System.out.println("Numero de socio para listar historico");
					int n_socio = Integer.parseInt(sc.nextLine());
					boolean socio_existe = false;
					
					for(int i = 0; i<clientes.size(); i++) {
						if(clientes.get(i).getnsocio() == n_socio) {
							socio_existe = true;
						}
					}					
					if(!socio_existe) {
						System.out.println("Numero de socio nao existe.");
					}
					else {
						for(int i = 0; i<clientes.get(n_socio-1).historico().size(); i++) {
							System.out.println(clientes.get(n_socio-1).historico().get(i));
						}
					}
					
					break;
			}
						
		}while(escolha!=0);
		sc.close();
	}
}
