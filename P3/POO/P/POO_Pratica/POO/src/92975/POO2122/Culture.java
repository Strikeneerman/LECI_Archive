
public class Culture extends Activity{

    //public static String Option;
    private static int participantes=0;
    private int partipantesVar;

    public enum Option{
        ARCHITECTURAL_TOUR,RIVER_TOUR,ART_MUSEUM,WINE_TASTING
    }

    Option optionCul;

   /*  public Culture(int participantes, int preco, Option optionCul){
        super(participantes,preco);
        this.setOptionCul(optionCul);
    }*/

    public Culture(Option optionCul, int preco){
        super(preco);
        this.setOptionCul(optionCul);
        partipantesVar = participantes++;
    }

    public void setOptionCul(Option optionCul){
        this.optionCul = optionCul;
    }

    public Option getOptionCul(){
        return optionCul;
    }

    int getNumeroParticipante(){
        return this.partipantesVar;
    }
}
