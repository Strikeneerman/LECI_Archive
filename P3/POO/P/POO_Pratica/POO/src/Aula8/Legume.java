package Aula8;

public class Legume extends Alimento{
    private String nome;

    public Legume(Double proteinas, Double calorias, Double peso,String nome){
        super(proteinas, calorias, peso);
        this.nome=nome;
    }

    public void set(Double proteinas, Double calorias, Double peso,String nome){
        this.proteinas = proteinas;
        this.calorias=calorias;
        this.peso=peso;
        this.nome=nome;
    }

    public String getNome(){
        return nome;
    }
}
