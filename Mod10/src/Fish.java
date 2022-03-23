
public class Fish extends Animal{

    private String fishDeatials;

    public Fish(String name, String color, double length, double weight) {
        super(name, color, length, weight);

        fishDeatials = "Im a fish, and subtype Fish from supertype Animal";
    }

    @Override
    public void printFishDetails() {
        System.out.println(fishDeatials);
    }
}

