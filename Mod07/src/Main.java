import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        Resultat student01 = new Resultat("torkel", 50);
        Resultat student02 = new Resultat("sam",40);
        Resultat student03 = new Resultat("john",60);
        Resultat student04 = new Resultat("tom",0);
        Resultat student05 = new Resultat("jerry",80);

        ArrayList <Resultat> myArr = new ArrayList<>();

        myArr.add(student01);
        myArr.add(student02);
        myArr.add(student03);
        myArr.add(student04);
        myArr.add(student05);

        for(int index = 0; index <myArr.size();){
            myArr.get(index).getResult();
            index += 2;
        }

    }
}
