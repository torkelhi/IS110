import java.util.Objects;
import java.util.Random;

public class Student {
    protected final int id;
    protected final String school;

   public Student(){
      id = new Random().nextInt();
      school = "UiA";
   }

   public boolean equals(Object obj)
   {
       if(this == obj){
           return true;
       }
       if(!(obj instanceof Student)) {
       return false;
       }
       Student other = (Student )obj;
       return (id == other.id) && (Objects.equals(school, other.school));
   }

   public int hashCode(){
       int hashCodeReliableToStudentId = 13;
       hashCodeReliableToStudentId = hashCodeReliableToStudentId * 12 * id;
       hashCodeReliableToStudentId = hashCodeReliableToStudentId * 12 * school.hashCode();

       return hashCodeReliableToStudentId;
   }

   public void displayStudent() {
       System.out.println("ID: "+id);
       System.out.println("Schoole: "+school);
   }

    public String toString(){
       String ID = id + school;
        return getClass() + ID;
    }

}

