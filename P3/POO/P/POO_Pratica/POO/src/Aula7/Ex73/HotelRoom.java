package Aula7.Ex73;

public class HotelRoom extends Accommodation {
      private String typeOfRoom;
    
    //construtors();
    public HotelRoom(){}
    public HotelRoom(String name, String code, String local, double priceNigth, double evaluation, boolean availability, String typeOfRoom){
        super(name, code, local, priceNigth, evaluation);
        this.typeOfRoom = typeOfRoom;
    }
    public HotelRoom(String name, String code, String local, double priceNigth, double evaluation, String typeOfRoom){
        super(name, code, local, priceNigth, evaluation);
        this.typeOfRoom = typeOfRoom;
    }
    public HotelRoom(String name, String code, String local, double priceNigth, double evaluation){
        super(name, code, local, priceNigth, evaluation);
        this.typeOfRoom = "single";
    }
    //set();
    public void setTypeOfRoom(String typrOfRoom){ this.typeOfRoom = typrOfRoom;}
    public String getTypeOfRoom(){return typeOfRoom;}

    @Override
    public String toString(){
        return "Hotel Room: " + super.toString() + " Type of Room: " + typeOfRoom + ";"; 
    }
    @Override
    public boolean equals(Object objt){
        return super.equals(objt) && this.typeOfRoom.equals(((HotelRoom)objt).typeOfRoom);
    }
    
}
