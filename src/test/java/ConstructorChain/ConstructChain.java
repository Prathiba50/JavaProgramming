package ConstructorChain;

public class ConstructChain {

   public  ConstructChain(){
        System.out.println("Default Constructor");
    }

    ConstructChain(String str){
        this();
        System.out.println("String Param: "+str);
    }

    public ConstructChain(int i){
       this("prathibha");
        System.out.println("int Param: "+i);
    }

    public static void main(String[] args) {
//        ConstructChain con = new ConstructChain();
//        ConstructChain con1 = new ConstructChain("Prathibha");
        ConstructChain con2 = new ConstructChain(10);




    }
}
