import java.util.Scanner;

// Complete o programa
public class DoStats {
  static final Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args) {
    // Cria um registo de estatisticas:
    statistics xstat = new statistics();
    System.out.print("Insira numeros(letras e simbolos terminam): ");
    double x = sc.nextDouble();
    xstat.max=x;
    xstat.min=x;
    xstat.num++;
    xstat.sum=x;
    xstat.sum2=Math.pow(x,2);
    // Enquanto houver um valor para ler:
    while (sc.hasNextDouble()) {
      // Lê um valor:
      x = sc.nextDouble();
      // Atualiza o registo de estatisticas:
      updateStats(xstat, x);
    }
    
    // Escreve resultados:
    System.out.printf("numero de valores = %d\n", xstat.num);
    System.out.printf("soma dos valores = %f\n", xstat.sum);
    System.out.printf("soma dos quadrados = %f\n", xstat.sum2);
    if (xstat.num > 0) {
      System.out.printf("min = %f\n", xstat.min);
      System.out.printf("max = %f\n", xstat.max);
      System.out.printf("média = %f\n", mean(xstat));
      System.out.printf("variancia = %f\n", variance(xstat));
    } else {
      System.out.printf("Lista vazia!");
    }
  }

  // Definir funções updateStats, mean e variance!
	public static void updateStats( statistics xstat , double x )
	{
		xstat.num++;
		if(xstat.max<x) {xstat.max=x;}
		if(xstat.min>x) {xstat.min=x;}
		xstat.sum+=x;
		xstat.sum+=Math.pow(x,2);
	}
	public static double mean ( statistics xstat)
	{
		double m = xstat.sum/xstat.num;
		return m;
	}
	public static double variance ( statistics xstat)
	{
		double var;
		var=Math.pow(xstat.sum2,2)/(xstat.num-Math.pow(mean(xstat),2));
		return var;
	}
  
}

// Definir classe Statistics
 class statistics{
		double max, min, sum=0, sum2=0;
		int num=0;
	}
