
public class Sport extends Activity{

    //public static String Modality;
    private static int participantes=0;
    private int partipantesVar;

    public enum Modality{
        KAYAK,HIKING
    }
    Modality modality;

   /*  public Sport(int participantes, int preco, Modality modality){
        super(participantes,preco);
        this.setModality(modality);
    }*/

    public Sport(Modality modality, int preco){
        super(preco);
        this.setModality(modality);
        partipantesVar = participantes++;
    }

    public void setModality(Modality modality){
        this.modality = modality;
    }

    public Modality getModality(){
        return  modality;
    }

    int getNumeroParticipante(){
        return this.partipantesVar;
    }
}
