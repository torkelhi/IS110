
public class Reptile extends Animal{

    private String reptileDetails;
    public Reptile(String name, String color, double length, double weight)
    {
        super(name, color, length, weight);
        reptileDetails = "im subtype Reptile from supertype Animal";
    }

    @Override
    public void printReptileDetails()
    {
        System.out.println(reptileDetails);
    }
}
