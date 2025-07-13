package Aula8;

public abstract class Alimento {

    Double proteinas,calorias,peso;

    public Alimento(Double proteinas, Double calorias, Double peso){
        this.set(proteinas, calorias, peso);
    }
    
    public void set (Double proteinas, Double calorias, Double peso){
        this.proteinas = proteinas;
        this.calorias=calorias;
        this.peso=peso;
    }

    public Double getProteinas(){
        return proteinas;
    }

    public Double getCalorias(){
        return calorias;
    }

    public Double getPeso(){
        return peso;
    }

}
