package Exception;

public class CustomExceptionClass extends Exception {

    public CustomExceptionClass(){
        super();
    }

    //Constructor that accept custom error message
    public CustomExceptionClass(String message){
        super(message);
    }

    //Constructor that accept a cause( another Exception)
    public CustomExceptionClass(Throwable cause){
        super(cause);
    }

    //Constructor that accept a custom message and cause
    public CustomExceptionClass(String message, Throwable cause){
        super(message,cause);
    }
}
