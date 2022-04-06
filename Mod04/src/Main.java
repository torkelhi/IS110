import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        String[] MyDesk = new String[4];
        MyDesk[0] = "pc";
        MyDesk[1] = "bottle";
        MyDesk[2] = "mouse";
        MyDesk[3] = "pen";
        System.out.println(MyDesk[1]);

        ArrayList<String> CPU = new ArrayList<>();
        CPU.add("ALU");
        CPU.add("Data register");
        CPU.add("kontrollenhet");
        CPU.add("Flaske");
        CPU.add("Snusboks");
        CPU.add("Skjer");





      /*  CPU.add("ALU");
        CPU.add("ALU");
        CPU.remove(2);
        System.out.println(CPU.size());
        System.out.println(CPU.get(2));*/

       /* remove(CPU,"ALU");
        System.out.println(CPU);*/
        addObject(CPU,"Flaske","hei");
        update(CPU, "hei", "HEI");
        // remove(CPU,"Snusboks");
        System.out.println(CPU);
    }

    public static void remove(ArrayList<String> ArrayList, String s)
    {
        Iterator<String> it = ArrayList.iterator();

        while (it.hasNext())
        {
            if(it.next().equals(s))
            {
                it.remove();
                break;
            }
        }
    }

    public static void addObject(ArrayList<String> List,String s, String e)
    {
        Iterator<String> it = List.iterator();
        int count = 0;
        while (it.hasNext())
        {
            if(it.next().equals(s))
            {
                List.add(count,e);
                break;
            }
            count++;
        }
    }

    public static void update (ArrayList<String> List, String s, String e) {
        Iterator<String> it = List.iterator();
        int count = 0;
        while(it.hasNext())
        {
            if(it.next().equals(s))
            {
                it.remove();
                List.add(count, e);
                break;
            }
            count++;
        }

    }
}

