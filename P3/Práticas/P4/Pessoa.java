package aula4;

import aula3.Data;

public class Pessoa {
	private String nome;
	private int cc;
	private Data dataNasc;
	
	public Pessoa(String nome, int cc, Data dataNasc) {
		this.nome = nome;
		this.cc = cc;
		this.dataNasc = dataNasc;
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
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
	
	@Override public String toString() {
		return this.nome + ", CC: " + this.cc + " Data nasc: " + this.dataNasc.toString();
	}

	
}
