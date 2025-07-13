package Aula7.Ex73;

public class Apartament extends Accommodation {
       private int nRoom;
    //construtors
    public Apartament(){}
    public Apartament(String name, String code, String local, double priceNigth, double evaluation, boolean availability, int nRoom){
        super(name, code, local, priceNigth, evaluation);
        this.nRoom = nRoom;
    }
    public Apartament(String name, String code, String local, double priceNigth, double evaluation, int nRoom){
        super(name, code, local, priceNigth, evaluation);
        this.nRoom = nRoom;
    }
    // set();
    public void setNRoom(int nRoom){this.nRoom = nRoom;}
    //get();
    public int getNRoom(){return this.nRoom;}

    @Override
    public String toString(){
        return "Apartament: " + super.toString() + " Numbers of Rooms" + nRoom + ";"; 
    }
    @Override
    public boolean equals(Object objt){
        return super.equals(objt) && this.nRoom == ((Apartament)objt).nRoom;
    }
}
