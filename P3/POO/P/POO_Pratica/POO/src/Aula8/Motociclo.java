package Aula8;

public class Motociclo extends Veiculo {

    public enum TipoVeiculo{
        desportivo,estrada
    }
    TipoVeiculo tipoVeiculo;

    public Motociclo(String matricula, String marca,String modelo, Double potencia,TipoVeiculo tipoVeiculo){
        super(matricula, marca, modelo, potencia);
        this.tipoVeiculo = tipoVeiculo;
    }

    public void set (String matricula, String marca,String modelo, Double potencia,TipoVeiculo tipoVeiculo){
        this.matricula = matricula;
        this.marca=marca;
        this.modelo=modelo;
        this.potencia=potencia;
        this.tipoVeiculo = tipoVeiculo;
    }

    public TipoVeiculo getTipoVeiculo(){
        return tipoVeiculo;
    }
}
