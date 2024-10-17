package Exception;

public class FinallyExample {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            int result = 10 / 0; // This will throw ArithmeticException
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
