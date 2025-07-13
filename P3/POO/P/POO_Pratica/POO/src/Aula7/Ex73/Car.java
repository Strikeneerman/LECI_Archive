package Aula7.Ex73;
//import java.util.Scanner;
public class Car {
    //private static Scanner sc = new Scanner(System.in);
    private char classe;
    private String engineType;
    private String status;  // adicionado
    private int cc; //
    
    //construtors();
    public Car(){}
    public Car(char classe, String engineType, String status){
        valid(classe);
        this.classe = classe;
        this.engineType = engineType;
        this.status = status;
    }
    public Car(char classe, String engineType){
        valid(classe);
        this.classe = classe;
        this.engineType = engineType;
        this.status = "DISPONIVEL";
    }
    public Car(char classe){
        valid(classe);
        this.classe = classe;
        this.engineType = "gasolina";
        this.status = "DISPONIVEL";
    }
    public Car(String engineType){
        this.classe = 'D';
        this.engineType = engineType;
        this.status = "DISPONIVEL";
    }
    
    //sets();
    public void setClasse(char classe){this.classe = classe;}
    public void setEgineType(String engineType){this.engineType = engineType;}
    public void setStatus(String status){this.status = status;}
    public void setCc(int cc){this.cc = cc;}

    //gets();
    public char getClasse(){return this.classe;}
    public String getEgineType(){return this.engineType;}
    public String getStatus(){return this.status;}
    public int getCc(){return this.cc;}
    public Car getCar(){return this;}

    // levantar(alugar)
    public void rent(int cc){
        if(this.status.equals("DISPONIVEL")){
            this.setCc(cc);
            this.setStatus("RESERVADO");
            System.out.println("RENTED CAR!");
        }
        else{
            System.out.println("Carro indisponível");
        }
    }
    //entregar
    public void deliver(){
        if(this.status.equals("RESERVADO")){
            this.setCc(0);
            this.setStatus("DISPONIVEL");
            System.out.println("CAR DELIVERED!");
        }
        else{
            System.out.println("Dados incorretos!");
        }
    } 
    
    @Override
    public String toString(){
        return "CAR: " + "Class: " + classe + "; " + "Engine Type: " + engineType + "; " +  "Status: " + status + ";"; 
    }
    @Override
    public boolean equals(Object objt){
        if(this == objt)
          return true;
        if(objt == null)
          return false;
        if(this.getClass() != objt.getClass())
          return false;
        Car other = (Car) objt;
        if(this.classe == '\0'){
            if(other.classe!= '\0')
              return false;
        }else if(this.classe != (other.classe))
              return false;
        if(this.engineType == null){
            if(other.engineType != null)
              return false;
        }else if(!this.engineType.equals(other.engineType))
              return false;
        return true;
    }
    //validar classe;
    private boolean valid(char classe){return classe >= 65 && classe <= 70;} 
}
