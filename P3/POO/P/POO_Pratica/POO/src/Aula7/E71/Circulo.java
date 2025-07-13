package Aula7.E71;
import java.lang.Math;
public class Circulo extends Forma {
    private double raio;
    private double PI = Math.PI;
    public Circulo(double raio, String cor){
        assert valid(raio): "O Raio deve ser positivo";
        this.raio = raio;
        this.cor = cor;
    }
    public void set(double raio){
        assert valid(raio): "O Raio deve ser positivo";
        this.raio = raio;
    }
    public void set(String cor){this.cor = cor;}
    public double getRaio(){return raio;}
    public Circulo get(){return this;}
    public String getCor(){return cor;}
    public double area(){return PI * raio;}
    public double perimetro(){return 2 * PI * raio;}

    public String toString(){  
        return "Tipo: Circulo" + "; " + "Raio: " + raio +"; " + "Diametro: " + (2 * raio) +  "; " + "Cor: " + cor + "; " + "Area: " + area() +  "; " + "Perimetro: " + perimetro();
    }
    public boolean equals(Circulo b){  
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

        if(this.raio == b.raio && valido == 1)
            return true;
        else
            return false;
    }
    public boolean valid(double raio){return raio > 0;}  
}
