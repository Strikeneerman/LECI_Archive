package Aula8;

public class Carne extends Alimento{
    
    public enum VariedadeCarne{
        vaca,porco,peru,frango,outra
    }
    VariedadeCarne variedade;

    public Carne(Double proteinas, Double calorias, Double peso,VariedadeCarne variedade){
        super(proteinas, calorias, peso);
        this.variedade=variedade;
    }

    public void set(Double proteinas, Double calorias, Double peso,VariedadeCarne variedade){
        this.proteinas = proteinas;
        this.calorias=calorias;
        this.peso=peso;
        this.variedade=variedade;
    }

    public VariedadeCarne getVariedade(){
        return variedade;
    }
}
