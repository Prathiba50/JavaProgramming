package ConstructorChain;

public class SuperAnimal {

    SuperAnimal(){
        System.out.println("Default animal");

    }

    SuperAnimal(String dog){
        this();
        System.out.println("Dog animal");
    }

    SuperAnimal(String cat, String food){
        this("dog");
        System.out.println("Cat animal will eat meat");

    }
}
