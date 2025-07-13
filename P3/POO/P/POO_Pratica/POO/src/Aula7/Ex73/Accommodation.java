package Aula7.Ex73;
import java.util.Scanner;
public class Accommodation {
    static Scanner sc = new Scanner(System.in);
    private String name;
    private String code;
    private String local;
    private double pricePNigth;
    private double evaluation;
    private double bill;  //posso colocar mais atributo?
    private boolean availability;
    
    //construdors();
    public Accommodation(){}
    public Accommodation(String name, String code, String local, double priceNigth, double evaluation, boolean availability){
        validEvaluation(evaluation);
        this.name  = name;
        this.code  = code;
        this.local = local;
        this.pricePNigth   = priceNigth;
        this.availability = availability;
        this.evaluation   = evaluation;
    }
    public Accommodation(String name, String code, String local, double priceNigth, double evaluation){
        this(name, code, local, priceNigth, evaluation, true);
    }
    //sets();
    public void setName(String name){this.name = name;}
    public void setCode(String code){this.code = code;}
    public void setLocal(String local){this.local = local;}
    public void setPriceNigth(double pricePNigth){this.pricePNigth = pricePNigth;}
    public void setEvaluation(double evaluation){validEvaluation(evaluation); this.evaluation = evaluation;}
    public void setAvailability(boolean availability){this.availability = availability;}
    
    // gets();
    public String getName(){return this.name;}
    public String getCode(){return this.code;}
    public String getLocal(){return this.local;}
    public double getPriceNigth(){return this.pricePNigth;}
    public double getEvaluation(){return this.evaluation;}
    public boolean getAvailability(){return this.availability;}
     // check-in/check-out;
    public void checkIn(String code){
        int noite;
        if(this.availability == true){
            System.out.print("How many Nigth?--> ");
            noite = sc.nextInt();
            this.bill = this.pricePNigth * noite;
            this.setAvailability(false);
            System.out.println("Reserved");
        }
        else{
            System.out.println("Unavailabe");
        }  
    }
    public void checkOut(String code){
        double payed, aux = 0, change = 0 ; // o valor do pagamento; 
        if(this.availability == false){   
            System.out.println("Your bill is: " + this.bill); 
            System.out.print("Payment: ");
            payed = sc.nextDouble();

            if(payed < this.bill){  // se ainda falta dinheiro;
               System.out.println("lack: " + (this.bill - payed));
               aux = sc.nextDouble(); 
            }
            else if(payed > this.bill)  // se deu dinheiro a mais;
                  change = payed - this.bill;
                  
            this.setAvailability(true);
            int noite = (int)(this.bill / this.pricePNigth);
            System.out.println("Check-out Complete!");
            System.out.println("payment receipt: ");
            System.out.printf(" Price per nigth: %.2f\n Total of night: %2d\n Bill: %.2f\n Payed: %.2f\n Change: %.2f\n Finish\n",
            this.pricePNigth, noite, this.bill, (payed + aux), change);
        }else{
             System.out.println("Codigo incorreto");
        }
    }
    
    @Override
    public String toString(){
        String s;
        s = String.format("Name:%s, Code:%s, Local:%s, Price Per Nigth: %.2f$, Evaluation: %.1f, Availability: %b " ,
                          this.name, this.code, this.local, this.pricePNigth, this.evaluation, this.availability);
        return s;
    }
    
    @Override
    public boolean equals(Object objt){
        if(this == objt)
          return true;
        if(objt == null)
          return false;
        if(this.getClass() != objt.getClass())
          return false;
        Accommodation other = (Accommodation) objt;
        if(this.name == null){
            if(other.name != null)
              return false;
        }else if(!this.name.equals(other.name))
              return false;
        if(this.code == null){
            if(other.code != null)
              return false;
        }else if(!this.code.equals(other.code))
              return false;
        if(this.local == null){
            if(other.local != null)
              return false;
        }else if(!this.local.equals(other.local))
              return false;
        return true;
    }
    
    //print();
    public void print(){System.out.println(toString());}
    // Validar Evaluation;
    private boolean validEvaluation(double evaluation){
        return evaluation >= 1 && evaluation <= 5;
    }
}
