package Revisions;

public class subDog extends dog {

    subDog(String name){
        super(name);
    }

    @Override
    void eatFood() {
        System.out.println(name +" can have pedigree");

    }
}
