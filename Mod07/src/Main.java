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

        for (Resultat resultat : myArr) {
            resultat.getResult();
        }

     String [] myArray = {"a", "b", "c", "d", "e"};
     int [] myArr2 = {1, 2, 3, 4, 5};



    for(int i = 0; i <5;i +=2){
         for(int j =0; j <5; j++){
             System.out.print(myArr2[j]);
         }
         System.out.print(myArray[i]);
     }
    }
}
