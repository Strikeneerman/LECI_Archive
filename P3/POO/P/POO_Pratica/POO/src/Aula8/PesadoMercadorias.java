package Aula8;

public class PesadoMercadorias extends Veiculo{
    private String numeroquadro;
    private Double peso, cargamaxima;

    public PesadoMercadorias(String matricula, String marca,String modelo, Double potencia,String numeroquadro,Double peso, Double cargamaxima){
        super(matricula, marca, modelo, potencia);
        this.numeroquadro=numeroquadro;
        this.peso = peso;
        this.cargamaxima = cargamaxima;
    }
    public void set (String matricula, String marca,String modelo, Double potencia,String numeroquadro,Double peso, Double cargamaxima){
        this.matricula = matricula;
        this.marca=marca;
        this.modelo=modelo;
        this.potencia=potencia;
        this.numeroquadro=numeroquadro;
        this.peso = peso;
        this.cargamaxima = cargamaxima;
    }

    public String getnumeroQuadro(){
        return numeroquadro;
    }

    public Double getPeso(){
        return peso;
    }

    public Double getcargaMaxima(){
        return cargamaxima;
    }
}
