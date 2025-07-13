package Aula8;

public class PesadoPassageiros extends Veiculo{
    private String numeroquadro;
    private Double peso;
    private int numeropassageiros;

    public PesadoPassageiros(String matricula, String marca,String modelo, Double potencia,String numeroquadro,Double peso, int numeropassageiros){
        super(matricula, marca, modelo, potencia);
        this.numeroquadro=numeroquadro;
        this.peso = peso;
        this.numeropassageiros = numeropassageiros;
    }

    public void set (String matricula, String marca,String modelo, Double potencia,String numeroquadro,Double peso, int numeropassageiros){
        this.matricula = matricula;
        this.marca=marca;
        this.modelo=modelo;
        this.potencia=potencia;
        this.numeroquadro=numeroquadro;
        this.peso = peso;
        this.numeropassageiros = numeropassageiros;
    }

    public String getnumeroQuadro(){
        return numeroquadro;
    }

    public Double getPeso(){
        return peso;
    }

    public int getnumeroPassageiros(){
        return numeropassageiros;
    }
}
