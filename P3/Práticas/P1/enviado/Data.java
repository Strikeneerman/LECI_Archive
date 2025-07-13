package aula1;

public class Data {

	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano)
	{
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
		if(dia <= 0 || dia >31 || mes <=0 || mes>12 || ano<=0 ) {
			throw new IllegalArgumentException("Data invalida");
		}
		
		
	}
	
	public String toString() {
		return this.dia +"-" + this.mes+"-" + this.ano;
	}

}
