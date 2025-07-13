import static java.lang.System.*;
import java.util.Scanner;
public class Agenda {
	private Tarefa[] tarefas = new Tarefa[1000];
	private int syze = 0;
	
	public void novaTarefa(Tarefa tarefa)
	{
		tarefas[syze] = tarefa;
		syze++;
		
		for(int i=0; i<syze; i++)
		{
			for(int j= i + 1; j < syze; j++)
			{
				if(tarefas[j].inicio().compareTo(tarefas[i].inicio())== -1)
				{
					Tarefa tmp = tarefas[i];
					tarefas[i] = tarefas[j];
					tarefas[j] = tmp;
				}
			}
		}
	
	}
	public void escreve()
	{
		for (int i = 0; i< syze ; i++)
		{
			System.out.println("--------------");
			System.out.println("Início -> "+ tarefas[i].inicio().extenso());
			System.out.println("Fim -> "+ tarefas[i].fim().extenso());
			System.out.println("Tarefa -> "+ tarefas[i].texto());
			System.out.println("--------------");	
		}
	}
	public Agenda filtra(Data d1, Data d2)
	{
		Agenda novaAgenda = new Agenda();
		Tarefa filtro = new Tarefa(d1,d2, "Filtro");
		
		for(int i = 0; i< syze; i++)
		{
			if(tarefas[i].intersecta(filtro))
			{
				novaAgenda.tarefas[novaAgenda.syze] = new Tarefa(tarefas[i].inicio(), tarefas[i].fim(), tarefas[i].texto());
				novaAgenda.syze++;
			}
		}
		return novaAgenda;
	}
}

