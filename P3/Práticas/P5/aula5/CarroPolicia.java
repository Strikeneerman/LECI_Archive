package aula5;

public class CarroPolicia extends Automovel implements Policia{
	
	private String tipo;
	private String ID;
	
	public CarroPolicia(String cor, int lugares, String marca,int ano,int velMax, double pot, double cons, double comb, int vidros, String tipo, String ID){
		super(cor, 4, marca, ano, velMax, pot,cons,comb,vidros);
		this.ID=ID;
		this.tipo=tipo;
	}
	
	@Override
	public String getTipo(){
		return tipo;
	}
	
	@Override
	public String getID(){
		return ID;
	}
	
	@Override
	public String toString() {
		return "CarroPolicia [tipo=" + tipo + ", ID=" + ID + "]";
	}

}
