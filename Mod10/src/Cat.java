public class Cat extends Mammal {
    /**
     * This class extends Mammal.
     * It's inheritance comes from class Animal and Mammal
     *
     * Constructor for Cat includes.
     * @param // final variables form class Animal.
     * And fields from class Mammal.
     */
    private String catDetails;
    public Cat(String name, String color, double length, double weight) {
        super(name, color, length, weight);
        catDetails = "im a Cat subtype from supertype Mammal that is a subtype from supertype Animal";
    }

    @Override
    public void printCatDetails()
    {
        System.out.println(catDetails);
    }
}
