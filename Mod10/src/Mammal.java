
public class Mammal extends Animal{

    private String mammalDetails;
    public Mammal(String name, String color, double length, double weight)
    {
        super(name, color, length, weight);
        mammalDetails = "im subtype mammal from superclass Animal";
    }
}
