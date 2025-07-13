import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EventManager {

    private String manager;
    Set <Client> cliente = new HashSet();

    public EventManager(String string) {
        this.setEventManager(manager);
    }

    public void setEventManager(String manager){
        this.manager = manager;
    }

    public Client addClient(String string, String string2) {
        cliente.add(new Client(string, string2));
        return null;
    }

    public Event addEvent(Client c1, LocalDate parse) {
        return null;
    }
    

    public char[] listClients() {
        return null;
    }

    public char[] listEvents() {
        return null;
    }

}
