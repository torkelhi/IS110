
abstract public class Animal {

    protected String name;
    protected String color;
    protected double weight;
    protected int age;

    abstract protected void setName(String name);

    abstract protected void setAge(int age);

    abstract protected void setColor(String color);

    abstract protected void setWeight(double weight);

    abstract public void printAnimal();


    abstract public String getName();
    abstract public String getColor();
    abstract public double getWeight();

}
