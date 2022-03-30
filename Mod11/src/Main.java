public class Main {

    /*
    Program for å legge til studenter i Teams.
    Student blir extendet av TechStudent og EconStudent.
    Programmet er for forståelse for arv, @Override av egne metoder og metoder fra Object klassen.
     */

    public static void main(String[] args){
        Team team01 = new Team("King");

        Student torkel = new TechStudent();
        Student eirik = new TechStudent();

        Student jacob = new EconStudent();
        Student joachim = new EconStudent();

        team01.addStudent(torkel);
        team01.addStudent(eirik);
        team01.addStudent(jacob);
        team01.addStudent(joachim);

        team01.printMembers();
    }
}
