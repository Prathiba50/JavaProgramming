package Revisions;

abstract class cat extends AnimalAbstractClass{

    public cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("cat says meow...");
    }
}
