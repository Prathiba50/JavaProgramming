package Exception;

public class TestCustomException {

    public static void checkNumber(int num) throws CustomExceptionClass{
        if(num<=0){
            throw new CustomExceptionClass("Number must be grater than Zero");
        }
        System.out.println("Number is valid");
    }

    public static void main(String args[]){
        try{
            checkNumber(4);
        }catch (CustomExceptionClass e){
            System.out.println("Cuaght custom exception: "+e.getMessage());
        }
    }

}
