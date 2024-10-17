package Practiced_Programs;

import java.util.Arrays;

public class add2arr {

    public static void main(String[] args) {
        int a[] = {3,2,1,4,5};
        int b[] = {5,4,1,6};

        int a1 = a.length;
        int b1 = b.length;

        int c[] = new int[a1+b1];

        System.arraycopy(a,0,c,0,a1);
        System.arraycopy(b,0,c,a1,b1);
        System.out.println(Arrays.toString(c));
    }
}
