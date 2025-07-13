package Aula8;

public class Taxi extends AutomovelLigeiro{
    private int numerolicenca;

    public Taxi(String matricula, String marca,String modelo, Double potencia,String numeroquadro,int capacidadebagageira,int numerolicenca){
        super(matricula, marca, modelo, potencia,numeroquadro,capacidadebagageira);
        this.numerolicenca=numerolicenca;

    }

    public void set (String matricula, String marca,String modelo, Double potencia,String numeroquadro,int capacidadebagageira,int numerolicenca){
        this.matricula = matricula;
        this.marca=marca;
        this.modelo=modelo;
        this.potencia=potencia;
        this.numeroquadro=numeroquadro;
        this.capacidadebagageira = capacidadebagageira;
        this.numerolicenca=numerolicenca;
    }

    public int getnumeroLicenca(){
        return numerolicenca;
    }
}
