package Aula8;

public class AutomovelLigeiro extends Veiculo{
    String numeroquadro;
    int capacidadebagageira;

    public AutomovelLigeiro(String matricula, String marca,String modelo, Double potencia,String numeroquadro,int capacidadebagageira){
        super(matricula, marca, modelo, potencia);
        this.numeroquadro=numeroquadro;
        this.capacidadebagageira = capacidadebagageira;

    }

    public void set (String matricula, String marca,String modelo, Double potencia,String numeroquadro,int capacidadebagageira){
        this.matricula = matricula;
        this.marca=marca;
        this.modelo=modelo;
        this.potencia=potencia;
        this.numeroquadro=numeroquadro;
        this.capacidadebagageira = capacidadebagageira;
    }

    public String getnumeroQuadro(){
        return numeroquadro;
    }
    public int getcapacidadebagageira(){
        return capacidadebagageira;
    }
}
