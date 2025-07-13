package aula3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	private static Data today = new Data();

	
	public Data(int dia,int mes,int ano) {
		this.dia = dia;
		if(dia>31 || dia <1) {
			throw new IllegalArgumentException("Dia Invalido");
		}
		this.mes = mes;
		if(mes>12 || mes <1) {
			throw new IllegalArgumentException("Mes Invalido");
		}
		this.ano = ano;
		if(ano < 1 || ano > 2019) {
			throw new IllegalArgumentException("Ano Invalido");
		}
	}
	
	public Data() {
		String[] d = currentDate().split("-");
		dia = Integer.parseInt(d[0]);
		mes = Integer.parseInt(d[1]);
		ano = Integer.parseInt(d[2]);	
	}
	
	public int getdia() {
		return this.dia;
	}
	
	public int getmes() {
		return this.mes;
	}
	
	public int getano() {
		return this.ano;
	}
	
	public String toString() {
		return String.format("%2d/%2d/%4d",this.dia,this.mes,this.ano);
	}

	private static String currentDate() {
        return DateTimeFormatter.ofPattern("dd-MM-yyyy").format(LocalDate.now());
	}
	
	public static Data today() {
		return today;
	}

}	
