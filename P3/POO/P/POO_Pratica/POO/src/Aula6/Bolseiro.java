package Aula6;

import Aula5.Date;

public class Bolseiro extends Aluno{
    private int bolsa;
    
    public Bolseiro(String iNome, int IBI, Date dataNasc, int bolsa){
        super(iNome,IBI,dataNasc);
        if(validBolsa(bolsa)==true){
        this.setBolsa(bolsa);
        }
        else{
            System.out.print("Valor de bolsa tem de ser positivo");
        }
       
    }

    public void setBolsa(int bolsa){
        this.bolsa = bolsa;
    }

    public int getBolsa(){
        return this.bolsa;
    }

    public String toString(){
        return super.toString() + "Bolsa: "+ bolsa;
}

    public static boolean validBolsa(int bolsa){
        if (bolsa < 0){ 
            return false;
        }
        else{
            return true;
        }

    }
    
}
