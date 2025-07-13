package aula1;
import java.util.*;
public class Pessoa {

	private String nome;
	private int cc;
	private Data dataNasc;
	
	public Pessoa(String nome, int cc, Data dataNasc)
	{
		this.nome = nome;
		this.cc = cc;
		this.dataNasc = dataNasc;
		
		if(cc <= 10000000 || cc>=99999999 ) {
			throw new IllegalArgumentException("CC invalido");
		}
		
	}
	
	public String getnome() {
		
		return this.nome;
		
	}
	
	public int getcc() {
		
		return this.cc;
		
	}

	public Data getdataNasc() {
	
		return this.dataNasc;
	
	}
	
	public static Comparator<Pessoa> nomeComp = new Comparator<Pessoa>() {

		public int compare(Pessoa n1, Pessoa n2) {
		   String nome1 = n1.getnome().toUpperCase();
		   String nome2 = n2.getnome().toUpperCase();
		   
		   return nome1.compareTo(nome2);

	    }
		
	};
	
	public static Comparator<Pessoa> ccComp = new Comparator<Pessoa>() {

		public int compare(Pessoa s1, Pessoa s2) {

		   int cc1 = s1.getcc();
		   int cc2 = s2.getcc();

		   /*For ascending order*/
		   return cc1-cc2;

	   }
	};
	
	
	public String toString() {
		return "nome: "+this.nome +" cc:" + this.cc+" data de nascimento:" + this.dataNasc;
	}
	
}
