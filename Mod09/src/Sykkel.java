public class Sykkel {

    private final String [] types = {"terreng", "sport", "barnesykkel", "normal"};

    private String farge;
    private String type;
    private double pris;
    private Gear gir;
    private Bremse forBremse;
    private Bremse bakBremse;


    public Sykkel(String farge, int type, double pris, int gearMaxCapacity, int bremseMaxStyrke, int bremseType, String serviceDato)
    {
        this.farge = farge;
        this.type = types[type];
        this.pris = pris;
        this.gir = new Gear(gearMaxCapacity);
        this.bakBremse = new Bremse(false, bremseMaxStyrke, bremseType, serviceDato);
        this.forBremse = new Bremse(true, bremseMaxStyrke, bremseType, serviceDato);
    }

    public String getType()
    {
        return type;
    }

    public double getPris()
    {
        return pris;
    }

    public void printSykkelStatus()
    {
        System.out.println("________________________________");
        System.out.println("Type : " + type);
        System.out.println("Farge : " + farge);
        System.out.println("Antall Gir: " + gir.getMAX_CAPACITY() + "\n");
        System.out.println("Forbremse : " + forBremse.getBremseStatus() +"\n");
        System.out.println("Bakbremse : " + bakBremse.getBremseStatus() + "\n");
        System.out.println("Pris : " + pris);
        System.out.println("________________________________");
    }
}
