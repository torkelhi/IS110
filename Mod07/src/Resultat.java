public class Resultat {

    public String name;
    public char grade;

    public Resultat(String name, int res){
        char pass = 'P';
        char fail = 'F';
        // (res > 50) ? pass : fail -- viss res er over 50 returnerer denn pass, visst den er under returnerer den fail.
        char c = (res > 50) ? pass : fail;
        grade = c;
        this.name = name;
    }

    public void getResult(){

        System.out.println(name + " : " + grade);

    }
}
