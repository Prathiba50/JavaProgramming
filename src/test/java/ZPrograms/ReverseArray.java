package ZPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

    public static void main(String[] args){

        int[] a = {4,2,3,1,5,7};

        System.out.println("Original Array: "+Arrays.toString(a));

        int n = a.length;

        for (int i = 0; i < n/2; i++) {
            int temp = a[i];
            a[i] = a[n-i-1] ;
            a[n-i-1] = temp;
        }
    System.out.println("The Reversed Array is: "+Arrays.toString(a));

        //Approach - 2
        int[] b = {5,2,7,1,3,6};

        List<Integer>  ls = new ArrayList<>(b.length);

        for (int i = 0; i < b.length ; i++) {
                ls.add(b[i]);
        }

        Collections.reverse(ls);
        System.out.println("After reversing an Array");
        System.out.println(ls);

    }
}
