package Revisions;

public class AnimalDrive {

    public static void main(String[] args) {

        System.out.println("----------------Dog Family----------");
        dog dg = new subDog("Hulpy");
        dg.makeSound();
        dg.eatFood();
        System.out.println("Dog name is: "+dg.name);

        System.out.println();
        System.out.println("-------------------Cat Family---------");
        cat ct = new subCat("Pinky");
        ct.makeSound();
        ct.eatFood();
        System.out.println("Cat name is: "+ct.name);
    }
}
