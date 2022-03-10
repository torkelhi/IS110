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
        }
    }

    //FilterFunksjoner
    public void printSykkelldyrereEnn(double pris)
    {
        Iterator<Sykkel> it = sykkel.iterator();
        int index=0;

        while (it.hasNext() && pris < sykkel.get(index).getPris())
        {
            it.next().printSykkelStatus();
            index ++;
        }
    }

    public void printSykkelEtterType(String TYPE)
    {
        Iterator<Sykkel> it = sykkel.iterator();
        String type = TYPE.toLowerCase();
        int index = 0;

        while (it.hasNext() && type.equals(sykkel.get(index).getType()))
        {
            it.next().printSykkelStatus();
            index ++;
        }
    }


}
