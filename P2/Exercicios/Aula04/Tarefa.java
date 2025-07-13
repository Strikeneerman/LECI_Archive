import static java.lang.System.*;
public class Tarefa{
	private Data inicio,fim;
	private String texto;
	
	public Tarefa(Data inicio, Data fim, String texto){
		this.inicio = inicio;
		this.fim = fim;
		this.texto = texto;	
		assert texto != "":"Texto nao pode ser vazio";
		assert (fim.ano > inicio.ano)||(fim.ano == inicio.ano && fim.mes > inicio.mes)||(fim.ano == inicio.ano && fim.mes == inicio.mes && fim.dia >= inicio.dia) :"A data final e menor que a data inicial";
	}
	public Data inicio(){
		return this.inicio;
	}
	public Data fim(){
		return this.fim;
	}
	public String texto(){
		return this.texto;
		
	}
	public String toString()
	{
		return String.format("%s---%s: %s", inicio.toString(), fim.toString(), texto);
	}
	public boolean intersecta(Tarefa otherTarefa)
	{
		if(this.inicio().compareTo(otherTarefa.fim()) == -1 || this.inicio().compareTo(otherTarefa.fim())==0 && (otherTarefa.inicio().compareTo(this.fim()) == -1 || otherTarefa.inicio().compareTo(this.fim()) == 0))
		{
			return true;
		}
		else
		{
			return false;	
		}
	}
}

