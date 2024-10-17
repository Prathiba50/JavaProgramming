package InterviewQ1;

class Animal{
    public void fam(){
        System.out.println("animal family");
    }
}

class Dog extends Animal {
    public void sound(){
        System.out.println("bow...bow..");
    }

}

public class instanceOfMethod {

    public static void main(String[] args){

        Animal an = new Dog();

        System.out.println(an instanceof Dog);

    }
}
