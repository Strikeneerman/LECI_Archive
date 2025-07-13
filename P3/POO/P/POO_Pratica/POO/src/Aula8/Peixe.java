package Aula8;

public class Peixe extends Alimento{
    public enum TipoPeixe{
        congelado,fresco
    }
    TipoPeixe tipoPeixe;
    
    public Peixe(Double proteinas, Double calorias, Double peso,TipoPeixe tipoPeixe){
        super(proteinas, calorias, peso);
        this.tipoPeixe=tipoPeixe;
    }

    public void set(Double proteinas, Double calorias, Double peso,TipoPeixe tipoPeixe){
        this.proteinas = proteinas;
        this.calorias=calorias;
        this.peso=peso;
        this.tipoPeixe=tipoPeixe;
    }

    public TipoPeixe getTipoPeixe(){
        return tipoPeixe;
    }
}
