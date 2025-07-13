import static java.lang.System.*;
import java.util.Calendar;

public class Data {
  private int dia, mes, ano;

  /** Inicia esta data com o dia de hoje. */
  public Data() {
    // Aqui usamos a classe Calendar da biblioteca standard para obter a data atual.
    Calendar today = Calendar.getInstance();
    dia = today.get(Calendar.DAY_OF_MONTH);
    mes = today.get(Calendar.MONTH) + 1;
    ano = today.get(Calendar.YEAR);
  }

  /** Inicia a data a partir do dia, mes e ano dados. */
  public Data(int dia, int mes, int ano) {
    this.dia = dia ;
    this.mes = mes ;
    this.ano = ano ;
  }

  /** Devolve esta data segundo a norma ISO 8601. */
  public String toString() {
    return String.format("%04d-%02d-%02d", ano, mes, dia);
  }

  /** Indica se ano é bissexto. */
  public static boolean bissexto(int ano) {
    return ano%4 == 0 && ano%100 != 0 || ano%400 == 0;
  }

  public int dia(){
	  return dia;
	  }
  public int mes(){
	  return mes;
	  }
  public int ano(){
	  return ano;
	  }

  /** Dimensões dos meses num ano comum. */
	private static final
  int[] diasMesComum = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

  /** Devolve o número de dias do mês dado. */
   public static int diasDoMes(int mes, int ano) {		
    int diaDoMes = diasMesComum[mes-1];
    if(mes == 2 && bissexto(ano) )
		diaDoMes = diaDoMes + 1;
    return diaDoMes;
  }

  /** Devolve o mes da data por extenso. */
  public String mesExtenso() { 
		String s ="";
		if (mes == 1)
		{
			s = "Janeiro";
		}
		else if (mes == 2)
		{
			s = "Fevereiro";
		}
		else if (mes == 3)
		{
			s = "Março";
		}
		else if (mes == 4)
		{
			s = "Abril";
		}
		else if (mes == 5)
		{
			s = "Maio";
		}
		else if (mes == 6)
		{
			s = "Junho";
		}
		else if (mes == 7)
		{
			s = "Julho";
		}
		else if (mes == 8)
		{
			s = "Agosto";
		}
		else if (mes == 9)
		{
			s = "Setembro";
		}
		else if (mes == 10)
		{
			s = "Outubro";
		}
		else if (mes == 11)
		{
			s = "Novembro";
		}
		else if (mes == 12)
		{
			s = "Dezembro";
		}
		else
		{	s = "Invalido";}
		return s;
	}
  

  /** Devolve esta data por extenso. */
	public String extenso() {
		
		return String.format("%02d de %s de %04d", dia, mesExtenso(), ano);	
  }

  /** Indica se um terno (dia, mes, ano) forma uma data válida. */
  public static boolean dataValida(int dia, int mes, int ano) {
    boolean B = true;
    int diaDoMes = diasMesComum[mes-1];
    if(mes == 2 && bissexto(ano) )
		{diaDoMes = diaDoMes + 1;}
		if(dia != diaDoMes)
		{
			B=false;
		}
	else{
		if(dia != diaDoMes)
		{
			B=false;
		}
	}
	return B;
  }
	/** Avança um dia */
  public void seguinte() {
    int diaDoMes = diasMesComum[mes-1];
    dia = dia + 1;
    if(mes == 2 && bissexto(ano) )
		{diaDoMes = diaDoMes + 1;}
		if(dia > diaDoMes)
		{
			mes = mes +1;
			dia = 1;
			if(mes>12)
			{
				ano = ano + 1;
				mes = 1;
			}
		}
	else{
		if(dia > diaDoMes)
		{
			mes = mes +1;
			if(mes>12)
			{
				ano = ano + 1;
				mes = 1;
			}
		}
	}
			
		
  }	
  

}

