package LamdaExpressions;

interface sayHello{
    void sayHelloJava8();
}

public class LamExp1 {
    public static void main(String[] args) {


        sayHello hello = () -> {System.out.println("Welcome to lamda exp");
        };
        hello.sayHelloJava8();
    }
}
