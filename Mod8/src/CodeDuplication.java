public class CodeDuplication {
    private String type;
    private String color;
    private int size;

    //

    public CodeDuplication(String type, String color, int size)
    {
        this.type = type;
        this.color = color;
        this.size = size;
    }

 /* Code duplicating

    public void myTypeIs (String type)
    {
        this.type = type;
        System.out.println("My Status is now \n" + type + "\n" + color+ "\n" + size));
    }
    public void myColorIs (String color)
    {
        this.color = color;
        System.out.println("My Status is now \n" + type + "\n" + color+ "\n" + size));
    }
    public void mySizeIs (int size)
    {
        this.size = size;

        System.out.println("My Status is now \n" + type + "\n" + color + "\n" + size);
    } */

    // Code etter refaktorisering og optimalisere koden til et høyre grad av Cohersion.

    public void myTypeIs (String type)
    {
        this.type = type;
        printStatus();
    }
    public void myColorIs (String color)
    {
        this.color = color;
        printStatus();
    }
    public void mySizeIs (int size)
    {
        this.size = size;
        printStatus();
    }

    public void printStatus()
    {
        System.out.println("My Status is now \n" + type + "\n" + color + "\n" + size);
    }


}
