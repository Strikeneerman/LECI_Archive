package aula5;

public abstract class Veiculo implements Comparable<Veiculo>  {
	
	private int ano;
	private String cor;
	private int rodas;
	private int lugares;
	private String marca;
	private double velMax;
	
	public Veiculo(String cor, int rodas, int lugares, String marca, int ano, double velMax){
		assert lugares>0 && rodas>0 && velMax>0;
		this.cor=cor;
		this.lugares=lugares;
		this.rodas=rodas;
		this.marca=marca;
		this.ano=ano;
		this.velMax=velMax;
	}
	
	public String getCor(){
		return cor;
	}
	
	public int getRodas(){
		return rodas;
	}
	
	public int getLugares(){
		return lugares;
	}
	
	public String getMarca(){
		return marca;
	}
	
	public int getAno(){
		return ano;
	}
	
	public double getVelMax(){
		return velMax;
	}
	
	@Override
	public int compareTo(Veiculo v){
		assert v!=null;
		
		if(this.getAno()>v.getAno()){
			return 1;
		}
		else if(this.getAno()<v.getAno()){
			return -1;
		}
		else return 0;
		
	}
	
	@Override
	public String toString() {
		return "Veículo [cor=" + cor + ", rodas=" + rodas + ", lugares=" + lugares + ", marca=" + marca + ", ano=" + ano
				+ ", velMax=" + velMax + "]";
	}
	
	
	
	
	
	
	
	
}
