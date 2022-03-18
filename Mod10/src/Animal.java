
public class Animal {

    private final String name;
    private final String color;
    private double length;
    private double weight;
    private int age;
    protected boolean isMammal;
    protected boolean isBird;
    protected boolean isReptile;
    protected boolean isAmphibian;
    protected boolean isFish;


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
        System.out.println("-----------" + "\n");
    }

    public String getName() {return name;}
    public String getColor() {return color;}
    public double getWeight() {return weight;}

}
