package aula5;

public class Bicicleta extends Veiculo{

	private String travoes;
	private int mudancas;
	
	public Bicicleta(String cor, int lugares, String marca,int ano,int velMax, String travoes, int mudancas){
		super(cor, 2, lugares, marca, ano, velMax);
		this.travoes=travoes;
		this.mudancas=mudancas;
	}
	
	public String getTravoes() {
		return travoes;
	}

	public int getMudancas() {
		return mudancas;
	}
	
	@Override
	public String toString() {
		return "Bicicleta [travoes=" + travoes + ", mudancas=" + mudancas + "]";
	}
}
