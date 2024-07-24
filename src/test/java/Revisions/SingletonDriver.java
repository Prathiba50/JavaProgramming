package Revisions;

public class SingletonDriver {
    public static void main(String[] args) {

        //Eager Initialization
        Singletone s = Singletone.getInstance();
        Singletone s2 = Singletone.getInstance();

        //Lazy Initialization
        SingletonLazyInit sl1 = SingletonLazyInit.getInstance();
        SingletonLazyInit sl2 = SingletonLazyInit.getInstance();

    }
}
