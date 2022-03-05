public class Main {
    public static void main(String[] args)
    {
        /*
        * Linje (9-12)
        * Bevis på Implicit Coupling hvor en instance av et objekt fra klassen EncapDemo endrer
        * fields til klassen Encapsulations. Dermed vil Objektet encapDemo2 ikke få den statusen man ønsker.
        *
        * Linje (17-x)
        */

        Encapsulation encapDemo = new Encapsulation();
        EncapDemo changeValue = new EncapDemo();
        System.out.println("\n");
        Encapsulation encapDemo2 = new Encapsulation();


    }



}
