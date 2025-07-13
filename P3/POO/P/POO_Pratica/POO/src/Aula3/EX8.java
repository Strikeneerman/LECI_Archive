package Aula3;
import java.util.Scanner;
public class EX8 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Double notaTotal[][] = new Double[16][3];
        //Double notaPratica[]= new Double[16];
        //Double notaTeorica[]= new Double[16];
       // Double notaFinal[]= new Double[16];
        Double notaT,notaP,notaF;
        for(int i = 0;i<notaTotal.length;i++){
        System.out.print("Nota teorica: ");
        notaT = sc.nextDouble();
        System.out.print("Nota pratica: ");
        notaP = sc.nextDouble();
        if(notaT>=0 && notaT<=20 && notaP>=0 && notaP<=20){
            notaTotal[i][0]=notaT;
            notaTotal[i][1]=notaP;
             if(notaT < 7.0 || notaP <7){
                 
                 notaTotal[i][2]=(double)66;
             }
             else{
                 notaF = notaT*0.4 + notaP*0.6;
                 notaTotal[i][2]=notaF;
             }
        }
        else{
            System.out.println("Valor inválido");
            i--;
            }
            
        }
        System.out.print("NotaT  NotaP  Pauta\n");
        for(int i = 0;i<notaTotal.length;i++){
            System.out.printf("%2.1f    %2.1f    %2.0f\n",notaTotal[i][0],notaTotal[i][1],notaTotal[i][2]);
        }  
        
    }
    
}
