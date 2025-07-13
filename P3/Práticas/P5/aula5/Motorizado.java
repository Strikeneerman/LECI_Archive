package aula5;

public abstract class Motorizado extends Veiculo {
	
	private double potencia, comb, cons;
	
	public Motorizado(String cor, int lugares, String marca,int ano,int velMax, double pot, double cons, double comb){
		super(cor, 4, lugares, marca, ano, velMax);
		assert pot>0 && comb>=0 && cons>0;
		this.potencia=pot;
		this.comb=comb;
		this.cons=cons;
	}
	
	public double getPotencia(){
		return potencia;
	}
	
	public double getCombustivel(){
		return comb;
	}
	
	public double getConsumo(){
		return cons;
	}
	
	@Override
	public String toString() {
		return "Motorizado [potencia=" + potencia + ", combustivel=" + comb + ", consumo=" + cons + "]";
	}

}
