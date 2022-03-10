import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Bremse {

    private final String [] types = {"a", "b", "c", "d", "e"};

    private final boolean forEllerBakBremse; // true hvis det er forbremse, false visst det bak bremse;
    private int maxStyrke;
    private String myType;
    private String sistService;

    public Bremse(boolean forEllerBakBremse, int maxStyrke,int myType, String sistService)
    {
        this.forEllerBakBremse = forEllerBakBremse;
        this.maxStyrke = maxStyrke;
        this.myType = types[myType];
        this.sistService = sistService;
    }

    public void printBremseStatus()
    {
        System.out.println(maxStyrke);
        System.out.println(myType);
        System.out.println(sistService);
    }


    public void upDateSistService()
    {
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        sistService = timeStamp;
    }

    /**
     * Overload til upDateSistSerive metoden. Dersom man skal sette inn spesifikk dato.
     * @param timeStamp
     */
    public void upDateSistService(String timeStamp)
    {
        sistService = timeStamp;
    }

    /**
     * Method til å beskrive bremsekraften.
     * @param breakpower (double mellom 0-1. 0-100% omgjort til desimaltall.
     * @return man kan bremse fra 0-100% kraft. maxstyrke * bremsekraften = Nåværende bremsekraft.
     */
    public double getStyrkeNaa(double breakpower)
    {
        if (breakpower < 0 )
        {
            return breakpower = 0;
        }
        if(breakpower < 1)
        {
            return breakpower = maxStyrke; // 1 * maxstyrke = maxstyrke.
        }
        return breakpower*maxStyrke;
    }

    public String getBremseStatus()
    {
        String status = "Type :"+myType+"\n"+"Maxstyrke :"+maxStyrke;
        return status;
    }


}
