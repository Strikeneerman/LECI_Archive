import java.util.*;


public class Cliente {
	private static int id = 0;
	private int nsocio;
	private String nome;
	private int cc;
	private Data dnasc;
	private int age;
	private int nmec;  //Estudante
	private String Curso; //Estudante
	private int nfunc; //Funcionario
	private int nfiscal; //Funcionario
	private int num_emprestimos;
	private ArrayList<Video> emprestados;
	private ArrayList<Video> historico;

//estudante
	public Cliente(String nome, int cc, Data nasc, int nmec, String curso) {
		id++;
		this.nsocio = id;
		this.nome = nome;
		this.cc = cc;
		this.dnasc = nasc;
		this.nmec = nmec;
		this.Curso = curso;
		this.age = 2019 - dnasc.getano();
		this.emprestados = new ArrayList<Video>();
		this.historico = new ArrayList<Video>();
		this.num_emprestimos = 0;
	}
//funcionario	
	public Cliente(String nome, int cc, Data nasc, int nfunc, int nfiscal) {
		id++;
		this.nsocio = id;
		this.nome = nome;
		this.cc = cc;
		this.dnasc = nasc;
		this.nfunc = nfunc;
		this.nfiscal = nfiscal;
		this.age = 2019 - dnasc.getano();
		this.emprestados = new ArrayList<Video>();
		this.historico = new ArrayList<Video>();
		this.num_emprestimos = 0;
	}
	
	public int getnsocio(){
		return this.nsocio;
	}
	
	public String getnome() {
		return this.nome;
	}
	
	public int getcc() {
		return this.cc;
	}
	
	public String getnasc() {
		return this.dnasc.toString();
	}
	
	public int getnmec() {
		return this.nmec;
	}
	
	public String getCurso() {
		return this.Curso;
	}
	
	public int getnfunc() {
		return this.nfunc;
	}
	
	public int getnfiscal() {
		return this.nfiscal;
	}
	
	public int getage() {
		return this.age;
	}
	
	public ArrayList<Video> historico(){
		return this.historico;
	}
		
	public void emprestimo(Video a) {
		emprestados.add(a);
		historico.add(a);
		this.num_emprestimos++;
	}

	public int num_emprestimos() {
		return this.num_emprestimos;
	}
	
	public void removemprest(Video b) {
		emprestados.remove(b);
	}
}
