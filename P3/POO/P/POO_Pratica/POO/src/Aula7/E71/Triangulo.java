package Aula7.E71;
import java.lang.Math;
public class Triangulo extends Forma {
    private double lado1;
    private double lado2;
    private double lado3;
public Triangulo(double lado1, double lado2, double lado3, String cor){
    valid(lado1, lado2, lado3);
    this.lado1 = lado1;
    this.lado2 = lado2;
    this.lado3 = lado3;
    this.cor = cor;
}
public void set(double lado1, double lado2, double lado3, String cor){
    valid(lado1, lado2, lado3);
    this.lado1 = lado1;
    this.lado2 = lado2;
    this.lado3 = lado3;
    this.cor = cor;
}
public double getLado1(){return lado1;}
public double getLado2(){return lado2;}
public double getLado3(){return lado3;}
public String getCor(){return cor;}
public Triangulo get(){return this;}
public double area(){
    double p; 
    double A;
    p = perimetro()/2;
    A = Math.pow((p*(p-lado1)*(p-lado2)*(p-lado3)), 2);
    return A;
}
public double perimetro(){
    return this.lado1 + this.lado2 + this.lado3;
}

public boolean valid(double lado1, double lado2, double lado3){
    return lado1 > 0 && lado2 > 0 && lado3 > 0 && triangularInequality(lado1, lado2, lado3);
}
public boolean triangularInequality(double lado1, double lado2, double lado3){
    return lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2); 
}
public String toString(){ //duvida
    return "Tipo: Triangulo" + "; " + "lado1: " + lado1 + "; " +  "lado2: " + lado2 + "; " + "Lado3: " +  lado3 + "; " + "Cor: " + cor + "; " + "Area: " + area() +  "; " + "Perimetro: " + perimetro();
}
public boolean equals(Triangulo b){    // duvida;
    int valido = -1;   // validar;
    String aux = "";  // auxiliar para receber a stringue completa;
    if(this.cor.length() == b.cor.length()){
        for(int i = 0; i < this.cor.length(); i++){
            char c = b.cor.charAt(i);
            char c1 = this.cor.charAt(i);
            if(Character.compare(c, c1) == 0)
              aux += Character.toString(c);
        }
    }
    else{
        return false;
    }
    if(aux.length() == this.cor.length())
       valido = 1;

    if(this.lado1 == b.lado1 && this.lado2 == b.lado2 && this.lado3 == b.lado3 && valido == 1)
        return true;
    else 
        return false;
}
    
}
