package aula5;

public class Automovel extends Motorizado{
	
	private int vidros;
	
	public Automovel(String cor, int lugares, String marca,int ano,int velMax, double pot, double cons, double comb, int vidros){
		super(cor, 4, marca, ano, velMax, pot,cons,comb);
		assert pot>0 && comb>=0 && cons>0;
		this.vidros=vidros;
	}
	
	public int getVidros(){
		return vidros;
	}


	@Override
	public String toString() {
		return "Automóvel [vidros=" + vidros + "]";
	}
}

