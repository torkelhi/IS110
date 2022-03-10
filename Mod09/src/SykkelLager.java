import java.util.ArrayList;
import java.util.Iterator;

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
        Iterator<Sykkel> it = sykkel.iterator();

        while (it.hasNext())
        {
            it.next().printSykkelStatus();
            System.out.println("\n");
        }
    }

    //FilterFunksjoner
    public void printSykkelldyrereEnn(double pris)
    {
        Iterator<Sykkel> it = sykkel.iterator();
        int index=0;

        while (it.hasNext()) {
            it.next();

            if (pris < sykkel.get(index).getPris())
            {
                sykkel.get(index).printSykkelStatus();
            System.out.println("\n");
            }

            index ++;
        }
    }

    public void printSykkelEtterType(String type)
    {
        Iterator<Sykkel> it = sykkel.iterator();
        int index = 0;

        while (it.hasNext())
        {
            it.next();
            if (type.equals(sykkel.get(index).getType()))
            {
                sykkel.get(index).printSykkelStatus();
                System.out.println("\n");
            }
            index++;
        }
    }


}
