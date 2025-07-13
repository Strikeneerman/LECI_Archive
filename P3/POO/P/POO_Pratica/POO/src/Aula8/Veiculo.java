package Aula8;

public abstract class Veiculo implements KmPercorridosInterface {
    String matricula, marca, modelo;
    Double potencia;
    int KMtotal=0,KMultimo;

    public Veiculo( String matricula, String marca,String modelo, Double potencia){
            this.set(matricula,marca,modelo,potencia);
    }

    public void set (String matricula, String marca,String modelo, Double potencia){
        this.matricula = matricula;
        this.marca=marca;
        this.modelo=modelo;
        this.potencia=potencia;
    }
    public String getMatricula(){
        return matricula;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public Double getPotencia(){
        return potencia;
    }

    public void trajeto(int quilometros){
        KMtotal=KMtotal+KMultimo;
    };
    public int ultimoTrajeto(){
        return KMultimo;
    };
    public int distanciaTotal(){
        return KMtotal;
    };
}
