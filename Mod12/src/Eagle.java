
public class Eagle extends Bird implements AnimalSound{
    /**
     * This class extends Bird.
     * It's inheritance comes from class Animal and Bird
     *
     * Constructor for Eagle includes.
     * @param // final variables form class Animal.
     * And fields from class Bird.
     */
    public Eagle(String name, String color, int age, double weight)
    {
        super(name, color, age, weight);
    }
    public void speak() {
        System.out.println("_____Silence_____");
    }

    public void act() {
        System.out.println("*Scouting from above looking for prey*");
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
