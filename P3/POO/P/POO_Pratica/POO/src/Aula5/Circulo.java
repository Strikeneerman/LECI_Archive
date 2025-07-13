package Aula5;

public class Circulo {
    double raio,area,perimetro;
    private static double pi = 3.14;

    public Circulo (double raio){
        this.set(raio);
    }

    public double getRaio(){
        return raio;
    }

    public void set(double raio){
        if(raio>=0){
        this.raio = raio;
        }
        else{
            System.out.print("Valor de raio tem de ser positivo!");
        }
    }

    public double areaCirculo(){
        area = pi*Math.pow(this.raio, 2);
        return area;
    }

    public double perimetroCirculo(){
        perimetro =2*pi*this.raio;
        return perimetro;
    }

    public String toString(){
        return "Circulo de raio "+ raio;
    }
    
}
