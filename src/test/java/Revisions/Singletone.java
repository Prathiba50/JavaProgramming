package Revisions;

public class Singletone {

    //Eager Initialization
    private static Singletone instance = new Singletone();

    private Singletone(){

    }

    public static Singletone getInstance(){
        System.out.println("Eager Initialization");
        return instance;
    }
}
