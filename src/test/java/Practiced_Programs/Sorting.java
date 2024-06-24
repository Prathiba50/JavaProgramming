package Practiced_Programs;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {

        int a[] = {4,2,3,5,6,1};

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(a[a.length-2]);

        int b[] = {8,2,5,1,3,6};

        for (int i = 0; i < b.length; i++) {

            for (int j = i+1; j < b.length ; j++) {
                int temp = 0;
                if (b[i] > b[j]) {
                    temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }
        System.out.println("After sorting b array: "+Arrays.toString(b));



    }
}
