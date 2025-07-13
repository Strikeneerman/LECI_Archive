import static java.lang.System.*;
import java.util.Calendar;

public class Data {
  private int dia, mes, ano;
  private String data;

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
  // Construtor exercicio 3.1
	public Data(String Date){
		char numero;
		int c = 0;
		String ANO="";
		String MES="";
		String DIA="";
		data = Date;
		for(int i = 0; i< data.length(); i++)
		{	
			numero = data.charAt(i);
			if(numero == '-')
			{
				c++;
			}
			else if (c==0)
			{
				ANO = ANO + numero;
				ano = Integer.parseInt(ANO);
			}
			else if (c==1)
			{
				MES = MES + numero;
				mes = Integer.parseInt(MES);
			}
			else if (c==2)
			{
				DIA = DIA + numero;
				dia = Integer.parseInt(DIA);
			}
			else 
			{
				continue;
			}
		}
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
		if(dia > diaDoMes){
			mes = mes +1;
			if(mes>12){
				ano = ano + 1;
				mes = 1;
				}
			}
		}	
	}
	/*Comparação das datas Metodo 1 (Meu Metodo)
	public int compareTo(Data d2)
	{	int c=0;
	   if(this.ano == d2.ano && this.mes == d2.mes && this.dia == d2.dia)
	   {
		c = 0;   
	   }
	   else if (this.ano < d2.ano || (this.ano == d2.ano && this.mes<d2.mes) || (this.ano == d2.ano && this.mes == d2.mes && this.dia < d2.dia))
	   {
		c = -1;   
	   }
	   else if (this.ano > d2.ano || (this.ano == d2.ano && this.mes>d2.mes) || (this.ano == d2.ano && this.mes == d2.mes && this.dia > d2.dia))
	   {
		c = 1;   
		}
	  return c;
	}*/
	//Comparação das datas Metodo 2 (Metodo Recomendado)
	public int compareTo(Data d2)
	{ int d =0;
	  int a = this.ano-d2.ano;
	  if(a!=0){
		d = a;  
	          }
	  else{
		  int b=this.mes-d2.mes;
		  if(b!=0){
			  d = b;
			      }
		  else{
			  int c=this.dia-d2.dia;
			  if(c!=0){
				  d = b;
			          }
			  else{ d = 0;
				  
				  }
		      }
	       }
	     return d;
	 }
				
}

