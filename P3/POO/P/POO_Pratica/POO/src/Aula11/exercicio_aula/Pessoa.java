package Aula11.exercicio_aula;

public class Pessoa {
    private String nome;
    private int cc;
    private Date dataNasc;

    public Pessoa (String nome, int cc, Date date){
        this.setPessoa(nome, cc, date);
    }

    public void setPessoa(String nome, int cc, Date dataNasc){
        if (validcc(cc)==true){
            this.nome = nome;
            this.cc = cc;
            this.dataNasc = dataNasc;
        }
        else{
            System.out.print("CC invalido");
        }

    }

    public String getName(){
        return this.nome;
    }

    public String toString(){
            return nome + " ; CC: " + cc +"; Data de Nascimento: "+ dataNasc;
    }

    public static boolean validcc(int cc){
        if (cc <= 1000000 || cc >= 9999999){ 
            return false;
        }
        else{
            return true;
        }

    }
}
