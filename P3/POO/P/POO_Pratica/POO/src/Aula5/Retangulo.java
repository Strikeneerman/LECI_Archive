package Aula5;

public class Retangulo {
    double lado,comprimento,area,perimetro;

    public Retangulo (double lado, double comprimento){
        this.set(lado,comprimento);
    }
    
    public double getLado(){
        return lado;
    }

    public double getComprimento(){
        return comprimento;
    }

    public void set(double lado,double comprimento){
        if(lado>=0 && comprimento>=0){
        this.lado = lado;
        this.comprimento = comprimento;
        }
        else{
            System.out.print("Valor de lado e comprimento tem de ser positivo!");
        }
    }

    public double areaRetangulo(){
        area = lado*comprimento;
        return area;
    }

    public double perimetroRetangulo(){
        perimetro = lado*2 + comprimento*2;
        return perimetro;
    }

    public String toString(){
        return "Retangulo de lado "+ lado +" e comprimento " + comprimento;
    }
    
}
