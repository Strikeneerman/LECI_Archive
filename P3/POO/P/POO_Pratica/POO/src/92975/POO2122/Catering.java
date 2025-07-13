
public class Catering extends Activity{

    //public static String Option;
    private static int participantes=0;
    private int partipantesVar;

    public enum Option{
        FULL_MENU,DRINKS_AND_SNACKS,LIGHT_BITES
    }

    Option optionCat;

   /*  public Catering(int participantes, int preco, Option optionCat){
        super(participantes,preco);
        this.setOptionCat(optionCat);
    }*/

    public Catering(Option optionCat, int preco){
        super(preco);
        this.setOptionCat(optionCat);
        partipantesVar = participantes++;
    }

    public void setOptionCat(Option optionCat){
        this.optionCat = optionCat;
    }

    public Option getOptionCat(){
        return optionCat;
    }

    int getNumeroParticipante(){
        return this.partipantesVar;
    }

}
