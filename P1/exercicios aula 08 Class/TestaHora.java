import java.util.Scanner;

public class TestaHora {
  static final Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args) {
    Hora inicio;  // tem de definir o novo tipo Hora!
    Hora fim;
    
    inicio = new Hora();
    fim = new Hora();
    inicio.h = 9;
    inicio.m = 23;
    inicio.s = 5;
    
    System.out.print("Começou às ");
    printHora(inicio);  // crie esta função!
    System.out.println(".");
    System.out.println("Quando termina?");
    fim = lerHora();  // crie esta função!
    System.out.print("Início: ");
    printHora(inicio);
    System.out.print(" Fim: ");
    printHora(fim);
  }
  public static Hora lerHora(){	
		Hora n = new Hora();
		do{
		System.out.print("Insira a hora ");
		n.h= sc.nextInt();}while(n.h<0 || n.h>23);
		do{
		System.out.print("Insira os minutos ");
		n.m= sc.nextInt();}while(n.m<0 || n.m>59);
		do{
		System.out.print("Insira os segundos ");
		n.s= sc.nextInt();}while(n.s<0 || n.s>59);
		return n;
	}
	public static void printHora(Hora a)
	{
		System.out.printf("%d:%d:%d",a.h,a.m,a.s);
	}
 
}
 class Hora
    {    
		 int h,m,s;
	}
/**
EXEMPLO do pretendido:
$ java TestaHora
Começou às 09:23:05.
Quando termina?
horas? 11
minutos? 72
minutos? 7
segundos? 2
Início: 09:23:05 Fim: 11:07:02.
**/
