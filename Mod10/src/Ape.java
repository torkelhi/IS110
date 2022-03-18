public class Ape extends Mammal{

    private final boolean isApe;
    /**
     * This class extends Mammal.
     * It's inheritance comes from class Animal and Mammal
     *
     * Constructor for Ape includes:
     * @param // final variables form class Animal.
     * And fields from class Mammal.
     */
    public Ape(String name, String color, double length, double weight) {
        super(name, color, length, weight);
        isApe = true;
    }
}
