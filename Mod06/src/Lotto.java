import java.lang.String;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Lotto programmer trekker kildekode fra klassen Ticket og danner
 * objekter (Tickets) med et Random tall hentet ved hjelp av java.util.Random.
 * Objektene lagres som Key i et Hashmap.
 *
 * @author Torkel Herskedal Ivarsøy
 */

public class Lotto {
    private final static Ticket ticket01 = new Ticket();
    private final static Ticket ticket02 = new Ticket();
    private final static Ticket ticket03 = new Ticket();
    private final static Ticket ticket04 = new Ticket();
    private final static HashMap <Integer, String> lottoMap = new HashMap<>();

    public static void main(String[] args){
        lottoMap.put(ticket01.num01, "Winner");
        lottoMap.put(ticket02.num01, "Winner");
        lottoMap.put(ticket03.num01, "Winner");
        lottoMap.put(ticket04.num01, "Winner");

        hashsetDemo();
        stringDemo("jeg er egentlig små bokstaver");
        checkForWinner(0);
        checkForWinner(1);
        checkForWinner(2);

    }

    /**
     * Denne metoden sjekker om ditt nummer er et vinner lodd eller ikke
     * @param myInt - ditt lottonr.
     */
    public static void checkForWinner(int myInt){
        System.out.println(lottoMap.get(myInt));
    }

    public static void hashsetDemo(){

        HashSet<String> setOfStrings = new HashSet<String>();
        setOfStrings.add("Hei");
        setOfStrings.add("Går det bra?");
        setOfStrings.add("Jeg er en string med mange bokstaver");
        setOfStrings.add("Jeg er en");

        System.out.println(setOfStrings);

    }
    // Metode med paramter (String) som man kan manipulere ved hjelp av java.lang.String
    public static void stringDemo(String demoString){

        System.out.println(demoString.toUpperCase());

    }
}
