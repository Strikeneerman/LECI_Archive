/*Aula pratica 2
 * 
 * Exercicio 2.5
 */
import static java.lang.System.*;

public class Exercicio2_5 {

  public static void main(String[] args) {
    Data atual = new Data();
    int dia = 25;
	int mes = 12;
	int ano = atual.ano()-1;
    Data Natal = new Data(dia, mes, ano);
	System.out.printf("%s\n", Natal.extenso());
	while(dia<atual.dia() || mes<atual.mes() || ano<atual.ano()){
		Natal.seguinte();
		System.out.printf("%s\n", Natal.extenso());
		dia++;
		if(dia > Natal.diasDoMes(mes, ano))
			{
				mes++;
				dia = 1;
				if(mes > 12)
				{
					ano++;
					mes = 1;
				}
			}
		}
	
	}
}

