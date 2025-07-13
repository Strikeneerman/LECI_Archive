package Aula5;

public class Triangulo {
    
    double lado1,lado2,lado3,area,perimetro;

    public Triangulo (double lado1, double lado2, double lado3){
        this.set(lado1,lado2,lado3);
    }
    
    public double getLado1(){
        return lado1;
    }

    public double getLado2(){
        return lado2;
    }

    public double getLado3(){
        return lado3;
    }

    public void set(double lado1, double lado2, double lado3){
        if(lado1>=0 && lado2>=0 && lado3>=0){
            if((lado1<lado2+lado3) && (lado2<lado1+lado3) && (lado3<lado1+lado2)){
                this.lado1 = lado1;
                this.lado2 = lado2;
                this.lado3 = lado3;
            }
            else{
                System.out.print("Valor dos lados tem de satisfazer a desigualdade triangular!");
            }
        }
        else{
            System.out.print("Valor dos lados tem de ser positivo!");
        }
    }

    public double areaTriangulo(){
        double p = perimetroTriangulo();
        area = Math.sqrt(p*(p-lado1)*(p-lado2)*(p-lado3));
        return area;
    }

    public double perimetroTriangulo(){
        perimetro = lado1+lado2+lado3;
        return perimetro;
    }

    public String toString(){
        return "Triangulo de lados "+ lado1 +","+lado2+" e "+lado3;
    }


}
