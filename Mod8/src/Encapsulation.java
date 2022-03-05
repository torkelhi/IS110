public class Encapsulation {

    static public String firstName = "Torkel"; // Fjerne public for å innkapsle dataen.
    static public String lastName = "Ivarsøy";
    static public  int age = 22;

    public Encapsulation()
    {
        System.out.print(firstName + "\n" + lastName + "\n" + age);
    }
}
