package aula5;

public class Moto extends Motorizado{
	
	private String capacete;
	
	public Moto(String cor, int lugares, String marca,int ano,int velMax, double pot, double cons, double comb, String capacete){
		super(cor, 2, marca, ano, velMax, pot,cons,comb);
		assert pot>0 && comb>=0 && cons>0;
		this.capacete=capacete;
	}
	
	public String getCapacete(){
		return capacete;
	}


	@Override
	public String toString() {
		return "Mota [capacete=" + capacete + "]";
	}
}
