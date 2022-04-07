
public class Dog extends Mammal implements AnimalSound{
    /**
     * This class extends Mammal.
     * It's inheritance comes from class Animal and Mammal
     *
     * Constructor for Dog includes.
     * @param // final variables form class Animal.
     * And fields from class Mammal.
     */
    public Dog(String name, String color, int age, double weight)
    {
        super(name, color, age, weight);
    }
    public void speak() {
        System.out.println("Wooof Wooof, bark bark");
    }

    public void act() {
        System.out.println("*Sniffs on the ground looking for snacks*");
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
