package Aula6;

import Aula5.Date;

public class Aluno extends Pessoa {
    private static int nmec=100;
    private int nmecVar;
    private Date dataInsc;
    
    public Aluno(String iNome, int IBI, Date dataNasc, Date dataInsc){
        super(iNome,IBI,dataNasc);
        this.dataInsc = dataInsc;
        nmecVar = nmec++;
    }
    public Aluno(String iNome, int IBI, Date dataNasc){
        this(iNome, IBI, dataNasc,new Date(21, 4, 2022));
    }

    public String toString(){
        return super.toString() + " nMec: "+ nmecVar+ " Data de inscriçao na instituiçao: " + dataInsc;
}

    int getNMec(){
        return this.nmecVar;
    }
}
