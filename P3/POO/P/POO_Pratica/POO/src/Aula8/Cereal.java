package Aula8;

public class Cereal extends Alimento{
    private String nome;

    public Cereal(Double proteinas, Double calorias, Double peso,String nome){
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
