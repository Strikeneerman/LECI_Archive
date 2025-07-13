package Aula7.Ex73;

public class TravelAgency {
     private String name;
     private String address;
     private Accommodation house[] = new Accommodation[100];
     private Car rent[] = new Car[100];
     private static int carIndx  = 0;
     private static int houIndex = 0;

    //construtors()
    public TravelAgency(){}
    public TravelAgency(String name, String address){
          this.name = name;
          this.address = address;  
     }
    //sets();
    public void setName(String name){this.name = name;}
    public void setAddress(String address){this.address = address;}
    public void setRent(Car x){
          if(carIndx == this.rent.length - 1){
               fullR();
          }
          this.rent[carIndx] = x;
          carIndx++;
     }
    public void setHouse(Accommodation x){
           if(houIndex == this.house.length)
                fullH();
     
          this.house[houIndex] = x;
          houIndex++;
     
     }
    //gets();
    public String getName(){return this.name;}
    public String getAddress(){return this.address;}
    public int getIndexHouse(){return houIndex;}
    public int getIndexCar(){return carIndx;}
    public Car getRent(int i){
         if(i >= 0 && i < houIndex)
            return rent[i];
          else{
                return null;
          }
     }
    public Accommodation getHouse(int i){
     //Accommodation x = new Accommodation();
     if(i >= 0 && i < houIndex)
       return house[i];
     else{
          return null;
     }

    }

    public int getACar(char clas, String egT){
         //Car x = new Car(); // um só carro
         int k = -1;
         for(int i = 0; i < rent.length; i++){
             if(rent[i].getClasse() == clas && rent[i].getEgineType().equals(egT)){
                k = i;
                  break;
             }
         }
         return k;
    }
    public int getAHous(String nom, String cd){  // return indice de um certo alojamento
     
     int k = -1;
     for(int i = 0; i < house.length; i++){
         if(house[i].getName().equals(nom) && house[i].getCode().equals(cd)){
            k = i;
              break;
         }
     }
     return k;
}

    public void rent(int cc, int i){
         rent[i].rent(cc);
    }
    public void deliver(int i){
         rent[i].deliver();
    }
    public void checkIn(int j){
         String cd = house[j].getCode();
         house[j].checkIn(cd);
    }
    public void checkOut(int j){
         String cd = house[j].getCode();
         house[j].checkOut(cd);
    }
    private void fullR(){
          Car aux[] = rent;
          rent = new Car[rent.length * 10];
          for(int i = 0; i < aux.length; i++){
               rent[i] = aux[i];
          }
    }
    private void fullH(){
     Accommodation aux[] = house;
     house = new Accommodation[house.length * 10];
     for(int i = 0; i < aux.length; i++){
          house[i] = aux[i];
     }
}


    @Override
    public String toString(){
         return "Travel Agency: " + this.name + "; " + "Address: " + this.address + ";";
    }
    @Override
    public boolean equals(Object objt){
        if(this == objt)
          return true;
        if(objt == null)
          return false;
        if(this.getClass() != objt.getClass())
          return false;
        TravelAgency other = (TravelAgency) objt;
        if(this.name == null){
            if(other.name != null)
              return false;
        }else if(!this.name.equals(other.name))
              return false;
        if(this.address == null){
            if(other.address != null)
              return false;
        }else if(!this.address.equals(other.address))
              return false;
        return true;
    }
}
