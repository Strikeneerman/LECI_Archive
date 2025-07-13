package Aula5;
import java.util.*;
public class Ex3 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    
    Circulo circ = new Circulo(0);
    Retangulo ret = new Retangulo(0,0);
    Triangulo tri = new Triangulo(0,0,0);
    int choice;
    do{ 
        do {
            System.out.println("Programa figuras: ");
            System.out.println("1-Criar figuras");
            System.out.println("2-Listar figuras");
            System.out.println("3-Comparar figuras");
            System.out.print("Input: ");
            choice = sc.nextInt();
            if(choice <0 || choice >3){
                System.out.println("Valor não é válido.");
            }
        } while (choice <0 || choice >3); 
        switch (choice){
            case 1:
                do{
                    System.out.print("Seleciona a figura: ");
                    System.out.println("1-Circulo");
                    System.out.println("2-Retangulo");
                    System.out.println("3-Triangulo");
                    System.out.print("Input: ");
                    choice = sc.nextInt();
                        if(choice <0 || choice >3){
                            System.out.println("Valor não é válido.");
                        }
                    }while(choice <1 || choice >3);
            
                    switch (choice){
                        case 1:
                            criarCirculo(circ);
                            break;
                        case 2:
                            criarRetangulo(ret);
                            break;
                        case 3:
                            criarTriangulo(tri);
                            break;
                    }
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 0:
                break;
    
         }
    }while(choice != 0);
    }

    public static void criarCirculo(Circulo circ){
        System.out.print("Raio: ");
        double raio = sc.nextDouble();
        circ.set(raio); 
    }
    public static void criarRetangulo(Retangulo ret){
        System.out.print("Lado: ");
        double lado = sc.nextDouble();
        System.out.print("Comprimento: ");
        double comprimento = sc.nextDouble();
        ret.set(lado, comprimento);
    }
    public static void criarTriangulo(Triangulo tri){
        System.out.print("Lado1: ");
        double lado1 = sc.nextDouble();
        System.out.print("Lado2: ");
        double lado2 = sc.nextDouble();
        System.out.print("Lado3: ");
        double lado3 = sc.nextDouble();
        tri.set(lado1,lado2,lado3); 
    }

}
