package aula4;

import aula3.Data;
import aula3.Pessoa;

import java.time.*;


public class Estudante extends Pessoa {
	private static int numid = 99;// begins in 100
	private int nmec;
	private String dins;
	
	public Estudante(String nome, int cc, Data dnasc, Data insc) {
		super(nome,cc,dnasc);
		numid++;
		this.nmec = numid;
		this.dins = insc.toString();
	}
	
	public Estudante(String nome, int cc, Data dnasc) {
		super(nome,cc,dnasc);
		numid++;
		this.nmec = numid;
		LocalDate date = LocalDate.now();
		this.dins = date.toString();
	}

	public int nMec() {
		return this.nmec;
	}
	
	public String getDins() {
		return this.dins;
	}
	
	@Override public String toString() {
		return super.getnome() + ", CC: " + super.getcc() + " Data: " + super.getdataNasc().toString()+" NMEC: "+this.nmec+ " Data insc: "+this.dins;//falta dinscri�ao
	}
}
