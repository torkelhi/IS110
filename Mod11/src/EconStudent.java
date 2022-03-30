import java.util.Objects;

public class EconStudent extends Student{

    private String econDegree;

    public EconStudent(){
        super();
        econDegree = "Economics";
    }

    @Override
    public void displayStudent(){
        super.displayStudent();                     //super call på metode
        System.out.println("Degree in: "+econDegree);
    }

}
