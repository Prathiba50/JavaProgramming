package Practiced_Programs;

import java.util.Arrays;

public class SecondHighestWithDups {

    public static void main(String[] args) {
        int a[] = {4, 3, 2, 6, 5, 6, 6,7};
        int size = a.length;

        if( size < 2){
            System.out.println("Invalid Input");
            return;
        }

        Arrays.sort(a);

        for (int i = size-2; i >= 0; i--) {
            if(a[i] != a[size-1]){
                System.out.println("The second highest in an array is: "+a[i]);
                return;
            }
        }
        System.out.println("There i sno second order in an Array");

    }

}
