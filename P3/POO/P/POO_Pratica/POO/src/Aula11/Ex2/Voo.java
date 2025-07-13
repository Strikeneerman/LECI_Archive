package Aula11.Ex2;

public class Voo {
    private String hora;
    private String voo;
    private String companhia;
    private String origem;
    private String atraso;
    private String obs; 

    public Voo(){}
    public Voo(String hora, String voo, String companhia, String origem, String atraso, String obs){
        this.hora = hora;
        this.voo = voo;
        this.companhia = companhia;
        this.origem = origem;
        this.atraso = atraso;
        this.obs = obs;
    }
    public Voo(String hora, String voo, String companhia, String origem){
        this.hora = hora;
        this.voo = voo;
        this.companhia = companhia;
        this.origem = origem;
        this.atraso = "";
        this.obs = "";
    }

    public void setHora(String hora){this.hora = hora;}
    public void setVoo(String voo){this.voo = voo;}
    public void setCompanhia(String companhia){this.companhia = companhia;}
    public void setOrigem(String origem){this.origem = origem;}
    public void setAtraso(String atraso){this.atraso = atraso;}
    public void setObs(String obs){this.obs = obs;}

    public String getHora(){return this.hora;}
    public String getVoo(){return this.voo;}
    public String getCompanhia(){return this.companhia;}
    public String getOrigem(){return this.origem;}
    public String getAtraso(){return this.atraso;}
    public String getObs(){return this.obs;}

    @Override
    public String toString(){
        return this.hora + "\t" + this.voo + "\t" + this.companhia + "\t" + this.origem + "\t" + this.atraso + "\t" + this.obs;
    }
}
