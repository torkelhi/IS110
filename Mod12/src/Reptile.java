public class Reptile extends Animal{


    public Reptile(String name, String color, int age, double weight) {
        super();
        setName(name);
        setColor(color);
        setAge(age);
        setWeight(weight);
    }

    protected void setName(String name){
        this.name = name;
    }

    protected void setColor(String color){
        this.color = color;
    }

    protected void setAge(int age){
        this.age = age;

    }

    protected void setWeight(double weight)
    {
        this.weight = weight;

    }

    public void printAnimal()
    {
        System.out.println("Halo, my name is "+name);
        System.out.println("I am the color "+color);
        System.out.println("Weight: "+weight);
    }

    public String getName() { return name;}
    public String getColor() {return color; }
    public double getWeight() {return weight;}

}
