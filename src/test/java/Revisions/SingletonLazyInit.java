package Revisions;

public class SingletonLazyInit {

    private  static  SingletonLazyInit instance;

    private SingletonLazyInit(){
    }

    public static SingletonLazyInit getInstance(){
        if(instance == null){
          new SingletonLazyInit();
          System.out.println("Lazy Initialization");
        }
        return instance;
    }
}
