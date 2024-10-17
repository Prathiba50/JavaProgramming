package ZPrograms;

public class SwapWithoutThirdVariable {

    public static void main(String[] args) {
        int a=20;
        int b=10;
        System.out.println("Before Swap: a = "+a+ " and b = "+b);

        //Approach -1
        a=a+b;
        b=a-b;
        a=a-b;

       /* a= a^b;
        b=a^b;
        a=a^b;*/

        System.out.println("After Swap: a = "+a+ " and b = "+b);
    }
}
