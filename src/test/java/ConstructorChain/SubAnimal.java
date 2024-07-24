package ConstructorChain;

public class SubAnimal  extends SuperAnimal{

    SubAnimal(){
        super("cat","meat");
    }

    public static void main(String[] args) {
        SubAnimal sb = new SubAnimal();
    }
}
