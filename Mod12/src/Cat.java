public class Cat extends Mammal implements AnimalSound{
    /**
     * This class extends Mammal.
     * It's inheritance comes from class Animal and Mammal
     *
     * Constructor for Cat includes.
     * @param // final variables form class Animal.
     * And fields from class Mammal.
     */
    public Cat(String name, String color, int age, double weight)
    {
        super(name, color, age, weight);
    }

    public void speak() {
        System.out.println("Mjau, Mjjaaaau...... Prrrr.. prrr");
    }

    public void act() {
        System.out.println("*Sleeps on sofa*");
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
