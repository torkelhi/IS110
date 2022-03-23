
public class Animal {

    private final String name;
    private final String color;
    private double length;
    private double weight;
    private int age;


public Animal(String name, String color, double length,double weight)
{
    this.name = name;
    this.color = color;
    this.length = length;
    this.weight = weight;
}

    public void updateAge(int age)
    {
        this.age = age;
    }

    public void updateLength(double length)
    {
       this.length = length;
    }

    public void updateWeight(double weight)
    {
        this.weight = weight;
    }

    public void printAnimal()
    {
        System.out.println("-----------");
        System.out.println(getClass());
        System.out.println("My name is "+getName()+".");
        System.out.println("I am the color "+getColor()+".");
        System.out.println("I weigh "+getWeight()+" kg.");
        printFishDetails();
        printReptileDetails();
        printCatDetails();
        System.out.println("-----------" + "\n");
    }

    //Methods overriden in subclasses.
    public void printFishDetails(){}
    public void printReptileDetails(){}
    public void printCatDetails(){}


    public String getName() {return name;}
    public String getColor() {return color;}
    public double getWeight() {return weight;}

}
