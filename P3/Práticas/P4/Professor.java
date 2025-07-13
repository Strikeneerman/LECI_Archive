package aula4;

import aula3.Data;
import aula3.Pessoa;

public class Professor extends Pessoa{
	
	private static int n=1;
	private int nmec;
	private int nFunc;
	private Data dataAd;
	
	public Professor(String nome, int cc, Data dataNasc, int nFunc, Data dataAd) {
		super(nome, cc, dataNasc);
		this.nFunc = nFunc;
		this.dataAd = dataAd;
		nmec = n;
		n++;
	}
	
	public Professor(String nome, int cc, Data dataNasc) {
		super(nome, cc, dataNasc);
		nmec = n;
		n++;
	}
	
	public int getnFunc() {
		return this.nFunc;
	}
	
	public Data getdataAd() {
		return this.dataAd;
	}
	
	@Override 
	public String toString() {
		return "Professor: " + super.getnome() + ", CC: " + super.getcc() + " Data de nascimento: " + super.getdataNasc().toString() + "(NMEC: "+nmec;
	}
	
	
}
