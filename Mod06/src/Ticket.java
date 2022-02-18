
import java.util.Random;

public class Ticket {
    public final int num01;

    /**
     * Constructer metode for klassen Ticket.
     * @param - None
     * @return - forekomst av en klasse
     */
    public Ticket(){
        num01 = new Random().nextInt(4);
    }
}
