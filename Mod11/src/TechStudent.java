import java.util.Objects;

public class TechStudent extends Student{

    private String techDegree;

    public TechStudent() {
        super();
        techDegree = "Information technology";
    }

    @Override
    public void displayStudent(){
        super.displayStudent();                     //super call på metode
        System.out.println("Degree in: "+techDegree);
    }

}
