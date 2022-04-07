public class Ape extends Mammal implements AnimalSound{

    /**
     * This class extends Mammal.
     * It's inheritance comes from class Animal and Mammal
     *
     * Constructor for Ape includes:
     * @param // final variables form class Animal.
     * And fields from class Mammal.
     */
    public Ape(String name, String color, int age, double weight)
    {
        super(name, color, age, weight);
    }

    public void speak() {
        System.out.println("Oahaha oha ohaa ha oha");
    }

    public void act() {
        System.out.println("*Swings from tree to another*");
    }

    public void printAnimal()
    {
        super.printAnimal();
        System.out.println(getClass());
        speak();
        act();
        System.out.println("");
    }
}
