
public class Main{

    private final SykkelLager sykkelLager = new SykkelLager();

    public void main(String[] args)
    {
        sykkelLager.addSykkelToLager("red",2,5500,6,150,1,"29.10.17");
        sykkelLager.addSykkelToLager("blue",1,10000,10,200,3,"05.01.18");
        sykkelLager.addSykkelToLager("grey",3,5000,2,100,2,"12.02.15");
        sykkelLager.addSykkelToLager("black",0,15000,0,120,0,"09.09.21");
        sykkelLager.addSykkelToLager("green",2,25000,4,200,2,"23.08.20");

        sykkelLager.printSykkelLager();
    }

}
