
public class Activity {

   // private int participantes;
    private int preco;

    /*public Activity(int participantes, int preco){
        this.setActivity(participantes,preco);
    }*/

    public Activity(int preco2) {
        this.setPreco(preco);
    }

   /*  public void setActivity(int participantes, int preco){
        
        this.participantes = participantes;
        this.preco = preco;
        
    }*/

    public void setPreco(int preco){
        this.preco = preco;
        
    }

   /* public int getParticipantes(){
        return this.participantes;
    }*/

    public int getPreco(){
        return this.preco;
    }
}
