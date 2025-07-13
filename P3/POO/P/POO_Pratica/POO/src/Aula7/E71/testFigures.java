package Aula7.E71;
import java.util.Scanner;
public class testFigures {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Circulo circular[] = new Circulo[100];
        Triangulo plano[]  = new Triangulo[100];
        Retangulo reto[]   = new Retangulo[100];
        int op, indx = 0, tri = 0, ret = 0;
        do {
            System.out.println("Menu!");
            System.out.print("Figure operations:\n1 -create new figure\n2 -print list of figures\n3 -Compare figures\n0 -exit\n");
            System.out.print("-->");
              op = sc.nextInt();
            
            switch (op) {
                case 1:
                            int ope;
                        do {
                            System.out.println("Which figure do you want to create?");
                            System.out.print("1- Circle\n2- Rectangle\n3-Triangle\n8- to finish creating\n");
                             ope = sc.nextInt();
                            switch (ope) {
                                case 1:
                                      System.out.println("Circule:");
                                      System.out.print("radius? -->");
                                      double raio = sc.nextDouble();
                                      //sc.next();
                                      System.out.print("Colour? -->");
                                      String cor = sc.next();
                                      circular[indx] = new Circulo(raio, cor);
                                      indx++;
                                    break;
                                case 2:
                                       System.out.println("Rectangle:");
                                       System.out.print("height: ");
                                       double altura = sc.nextDouble();
                                       System.out.print("length: ");
                                       double comprimento = sc.nextDouble();
                                       //sc.next();
                                       System.out.print("Colour? -->");
                                       String corR = sc.next();
                                       reto[ret] = new Retangulo(comprimento, altura, corR);
                                       ret++;
                                    break;
                                case 3:
                                       System.out.println("Triangle:");
                                       System.out.println("x1 -- x2 -- x3 --> sides of triangle");
                                       System.out.print("x1--> ");
                                       double lado1 = sc.nextDouble();
                                       System.out.print("x2--> ");
                                       double lado2 = sc.nextDouble();
                                       System.out.print("x3--> ");
                                       double lado3 = sc.nextDouble();
                                       //sc.next();
                                       System.out.print("Colour? -->");
                                       String corT = sc.next();
                                       plano[tri] = new Triangulo(lado1, lado2, lado3, corT);
                                       tri++;
                                    break;
                                case 8:
                                        System.out.println("Exit!...");
                                    break;
                            }
                            
                        } while (ope != 8);
                    break;
                case 2:
                        System.out.println("Which figure do you want to print?: ");
                        System.out.println("1-Circle\n2-Rectangle\n3-Triangle\n4-All");
                        System.out.print("--> ");
                        int pri = sc.nextInt();
                        switch (pri) {
                            case 1:
                                   for(int j = 0; j< indx; j++){ //o index foi criado logo ao inicio então terá a índice do ultimo elemento no array;
                                       System.out.println(circular[j]);
                                   }
                                break;
                            case 2:
                                   for(int j = 0; j< ret; j++){ // o ret foi criado logo ao inicio então terá a índice do ultimo elemento no array;
                                        System.out.println(reto[j]);
                                    }
                                break;
                            case 3:
                                   for(int j = 0; j< tri; j++){ // o tri foi criado logo ao inicio então terá a índice do ultimo elemento no array;
                                        System.out.println(plano[j]);
                                    }
                                break;
                                
                        
                            case 4:
                                   for(int j = 0; j< indx; j++){ 
                                        System.out.println(circular[j]);
                                    }
                                    System.out.println();
                                   for(int j = 0; j< ret; j++){ 
                                        System.out.println(reto[j]);
                                    }
                                    System.out.println();
                                   for(int j = 0; j< tri; j++){
                                        System.out.println(plano[j]);
                                    }
                                    System.out.println();
                                break;
                        }
                    break;
                case 3:
                        System.out.println("Which figure do you want to compare?: ");
                        System.out.println("1-Circle\n2-Rectangle\n3-Triangle");
                        System.out.print("-->");
                        int opr = sc.nextInt();
                        switch (opr) {
                            case 1:
                                   System.out.println("Circle:");
                                   System.out.print("what the radius?--> ");
                                   int rad = sc.nextInt();
                                   //sc.next();
                                   System.out.print("What the Colour? -->");
                                   String cor = sc.next();
                                   Circulo b = new Circulo(rad, cor);  // novo circulo para comparação

                                   System.out.println("How do you want to compare?");
                                   System.out.println("1-with a certain index\n2-with everyone on the list");
                                   int ops = sc.nextInt();

                                   switch (ops) {
                                       case 1:
                                              System.out.print("what the index?-->");
                                              int ind = sc.nextInt();

                                              if(circular[ind] != null){
                                                  if(circular[ind].equals(b) == true){
                                                      System.out.println("equals!");
                                                    }
                                                   else{
                                                       System.out.println("not equal!");
                                                    }
                                                }else{
                                                    System.out.println("There is no circle in this position!");
                                                }
                                            break;
                                        case 2:
                                                boolean same;
                                                int count = 0; 
                                                for(int j = 0; j < indx; j++){
                                                   if(circular[j].equals(b) == true){
                                                        same = true;
                                                        count++;
                                                    }
                                                    else{
                                                        same = false;
                                                    }
                                                }
                                                if(same = true){
                                                    System.out.printf("There are in total %d circles equal to this one\n", count);
                                                }else{
                                                    System.out.println("In the list there are no circles like this one!");
                                                }
                                               
                                            break;
                                       default:
                                                System.out.println("Op invalid!");
                                           break;
                                   }
                                break;
                            case 2:
                                    System.out.println("Rectangle:");

                                    System.out.print("what the height?--> ");
                                    double altura = sc.nextDouble();
                                    System.out.print("what the length?--> ");
                                    double comprimento = sc.nextDouble();
                                    //sc.next();
                                    System.out.print("Colour? -->");
                                    String corR = sc.next();

                                    Retangulo c = new Retangulo(comprimento, altura, corR); // novo Retangulo para comparação

                                    System.out.println("How do you want to compare?");
                                    System.out.println("1-with a certain index\n2-with everyone on the list");
                                    int opx = sc.nextInt();

                                    switch (opx) {
                                        case 1:
                                                System.out.print("what the index?-->");
                                                int ind = sc.nextInt();

                                                if(reto[ind] != null){
                                                    if(reto[ind].equals(c) == true){
                                                        System.out.println("equals!");
                                                        }
                                                        else{
                                                            System.out.println("not equal!");
                                                        }
                                                    }else{
                                                        System.out.println("There is no Rectangle in this position!");
                                                    }
                                            break;
                                        case 2:
                                                boolean same;
                                                int count = 0; 
                                                for(int j = 0; j < ret; j++){
                                                    if(reto[j].equals(c) == true){
                                                        same = true;
                                                        count++;
                                                    }
                                                    else{
                                                        same = false;
                                                    }
                                                }
                                                if(same = true){
                                                    System.out.printf("There are in total %d Rectangle equal to this one\n", count);
                                                }else{
                                                    System.out.println("In the list there are no Rectangle like this one!");
                                                }
                                            break;
                                        default:
                                                System.out.println("Op invalid!");
                                            break;
                                    }
                                break;
                            case 3:
                                
                                    System.out.println("Triangle:");
                                    System.out.println("x1--x2--x3: sides of the triangle");

                                    System.out.print("x1--> ");
                                    double lado1 = sc.nextDouble();
                                    System.out.print("x2--> ");
                                    double lado2 = sc.nextDouble();
                                    System.out.print("x3--> ");
                                    double lado3 = sc.nextDouble();
                                    System.out.print("Colour? -->");
                                    String corT = sc.next();

                                    Triangulo d = new Triangulo(lado1, lado2, lado3, corT); // novo triangulo para comparação

                                    System.out.println("How do you want to compare?");
                                    System.out.println("1-with a certain index\n2-with everyone on the list");
                                    int opz = sc.nextInt();

                                    switch (opz) {
                                        case 1:
                                            System.out.print("what the index?-->");
                                            int ind = sc.nextInt();
                                            if(plano[ind] != null){
                                                if(plano[ind].equals(d) == true){
                                                    System.out.println("equals!");
                                                    }
                                                    else{
                                                        System.out.println("not equal!");
                                                    }
                                                }else{
                                                    System.out.println("There is no Triangle in this position!");
                                                }
                                            break;
                                        case 2:
                                                boolean same;
                                                int count = 0; 
                                                for(int j = 0; j < tri; j++){
                                                    if(plano[j].equals(d) == true){
                                                        same = true;
                                                        count++;
                                                    }
                                                    else{
                                                        same = false;
                                                    }
                                                }
                                                if(same = true){
                                                    System.out.printf("There are in total %d Triangle equal to this one\n", count);
                                                }else{
                                                    System.out.println("In the list there are no Rectangle like this one!");
                                                }
                                            break;
                                        default:
                                                System.out.println("Op invalid!");
                                            break;
                                    }
                                break;
                            default:
                                    System.out.println("op invalid!");
                                break;
                        }
                    break;
                case 0:
                       System.out.println("good job!");
                    break;
            }  
        } while (op != 0);
        sc.close();
    }
}
