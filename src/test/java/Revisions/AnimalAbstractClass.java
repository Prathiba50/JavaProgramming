package Revisions;

abstract class AnimalAbstractClass {
    String name;

    public AnimalAbstractClass(String name) {
        this.name = name;
    }

   abstract void makeSound();
   abstract void eatFood();
   }
