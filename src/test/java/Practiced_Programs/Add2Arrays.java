package Practiced_Programs;

import java.util.Arrays;

public class Add2Arrays {

    public static void main(String args[]){
        int a[] = {2,3,4,1};
        int b[] = {4,2,4,1};
        int a1 = a.length;
        int b1 = b.length;

        int c[] = new int[a1+b1];

        System.arraycopy(a,0,c,0,a1);
        System.arraycopy(b,0,c,a1,b1);
        System.out.println("After adding two Arrays: "+ Arrays.toString(c));

    }
}
