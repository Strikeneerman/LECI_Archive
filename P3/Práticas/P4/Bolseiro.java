package aula4;

import aula3.Data;

public class Bolseiro extends Estudante{
	private int valorBolsa;
	
	public Bolseiro(String nome, int cc, Data dnas) {
		super(nome,cc,dnas);

	}
	
	public String nome() {
		return this.getnome();
	}
	
	public void setBolsa(int bolsa) {
		this.valorBolsa = bolsa;
	}
	
	public int bolsa() {
		return this.valorBolsa;
	}
	
	@Override public String toString() {
		return super.getnome() + ", CC: " + super.getcc() + " Data nasc: " + super.getdataNasc().toString()+" NMEC: "+super.nMec()+" Data insc: "+super.getDins() +", Bolseiro com bolsa de: "+this.valorBolsa;
	}
}
