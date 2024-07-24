package Revisions;

public class subCat extends cat{

    subCat(String name){
        super(name);
    }

    @Override
    void eatFood() {
        System.out.println(name+" can have milk");
    }


}
