import static java.lang.System.*;
public class Tarefa{
	private Data inicio,fim;
	private String texto;
	
	public Tarefa(Data inicio, Data fim, String texto){
		this.inicio = inicio;
		this.fim = fim;
		this.texto = texto;	
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

