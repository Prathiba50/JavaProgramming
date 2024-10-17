public class ExceptionHandling {

    public static void main(String[] args){

        try{
            int a = 100/0;
        }catch (ArithmeticException e){
           e.printStackTrace();
        }
        finally {
            System.out.println("From finally block");
        }
    }
}
