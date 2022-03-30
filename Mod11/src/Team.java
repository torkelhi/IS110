import java.util.ArrayList;

public class Team {

    private final String name;
    private ArrayList<Student> team = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    /**
     * Method for adding student in a team.
     * Sjekker om listen inneholder studenten fra før av.
     * Bruker equals metoden i klassen Student for å sjekke "content" likhet.
     * @param student
     */
    public void addStudent(Student student)
    {

        for (Student studentMember : team)
        {
            if((studentMember.equals(student))) {
                return;
            }
        }
        team.add(student);
    }


    public void printMembers(){
        for(Student teamMember : team){
            teamMember.displayStudent();
            System.out.println(" ");
        }
    }

}
