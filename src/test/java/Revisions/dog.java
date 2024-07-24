package Revisions;

abstract class dog extends AnimalAbstractClass {

    public dog(String name){
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("dog says woof....");
    }


}
