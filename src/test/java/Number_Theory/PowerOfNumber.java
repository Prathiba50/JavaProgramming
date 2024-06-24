package Number_Theory;

public class PowerOfNumber {

    //Approach - 1
    public static int power(int x, int exponent){
        int pow = 1;
        for (int i = 0; i < exponent ; i++) {
            if(exponent == 0 )
                return 1;

            pow = pow * x;
        }
       return pow;
    }

    //Approach - 2
    public static int power1(int x, int y){

        if(y==0)
            return 1;
        if(y % 2 == 0){
            return power1(x,y/2)*power1(x,y/2);
        }else
            return  x * power1(x,y/2)*power1(x,y/2);
    }

    public static void main(String[] args) {
        int x = 2;
        int exponent = 3;
        System.out.println(x +" to the power of " + exponent + " is "+ power(x,exponent));

    }
}
