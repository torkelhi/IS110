import java.util.ArrayList;

public class SykkelLager {

    private ArrayList<Sykkel> sykkel;

    public SykkelLager() {
        sykkel = new ArrayList<Sykkel>();
    }

    public void addSykkelToLager(String farge, int type, double pris, int gearMaxCapacity, int bremseMaxStyrke, int bremseType, String serviceDato)
    {
        sykkel.add(new Sykkel(farge, type, pris,gearMaxCapacity, bremseMaxStyrke, bremseType, serviceDato));
    }

    // Printer ut alle sykler
    public void printSykkelLager()
    {
        for (Sykkel value : sykkel)
        {
            value.printSykkelStatus();
            System.out.println("\n");
        }
    }

    //FilterFunksjoner

    /**
     * Metode som printer ut sykkelen dersom
     * sykkelen sin pris er høyere en pris i param.
     * @param pris
     */
    public void printSykkelldyrereEnn(double pris)
    {
        for (Sykkel sykkel : sykkel)
        {
            if (pris < sykkel.getPris())
            {
                sykkel.printSykkelStatus();
                System.out.println("\n");
            }
        }
    }


    /**
     * Metode som går gjennom Arraylisten ved og printer
     * dersom String type er lik typen til sykkelen.
     * @param type
     */
    public void printSykkelEtterType(String type)
    {


        for (Sykkel sykkel : sykkel)
        {
            if (type.equals(sykkel.getType()))
            {
                sykkel.printSykkelStatus();
                System.out.println("\n");
            }
        }
    }


}
