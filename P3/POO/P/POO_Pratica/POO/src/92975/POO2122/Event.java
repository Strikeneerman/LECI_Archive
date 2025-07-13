import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Event {

    LocalDate date;
    List <Activity> lista = new ArrayList<>();

    public Event(List lista, LocalDate date){
       
        this.setEvent(lista,date);
        
    }

    public void setEvent(List lista, LocalDate date){
        this.lista = lista;
        this.date = date;
    }

    public Event addActivity(Activity activity) {
        lista.add(activity);
        return null;
    }
}
