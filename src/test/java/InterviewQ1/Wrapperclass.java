package InterviewQ1;

public class Wrapperclass {
    public static void main(String[] args){

        //Boxing
        int primitiveInt = 100;
        char primitiveChar = 'A';

        //Autoboxing converting primitive to wrapper class object
         Integer wrapperInt = primitiveInt;
         Character wrapperChar = primitiveChar;

         System.out.println("Wrapper Integer : "+wrapperInt);
         System.out.println("Wrapper Character : " +wrapperChar);

        // Unboxing: Converting wrapper class objects back to primitive types
        int unboxedInt = wrapperInt;
        char unboxedChar = wrapperChar;

        // Displaying the unboxed primitives
        System.out.println("Unboxed int: " + unboxedInt);
        System.out.println("Unboxed char: " + unboxedChar);

    }
}
