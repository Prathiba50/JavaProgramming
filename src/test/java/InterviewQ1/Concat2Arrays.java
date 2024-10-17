package InterviewQ1;

import java.util.Arrays;

public class Concat2Arrays {
    public static void main(String[] args) {
        int c[] = {2,0,1,0,4};
        int a[] = {2,1,4};
        int b[] = {0,0}; //[2,1,4,0,0]


        int op[] = new int[a.length+b.length];
        System.arraycopy(a,0,op,0,a.length);
        System.arraycopy(b,0,op,a.length,b.length);
        System.out.println(Arrays.toString(op));





//        System.out.println(Arrays.toString(a)+Arrays.toString(b));
    }
}
