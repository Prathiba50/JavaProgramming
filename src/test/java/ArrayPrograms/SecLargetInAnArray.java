package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class SecLargetInAnArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an Array");

        int size = s.nextInt();
        int a[] = new int[size];

        /*int arr[] = new int[0];
        System.out.println(arr.length);

        int ar[] = {};
        System.out.println(ar.length);*/

        for(int i=0; i<a.length;i++){
            a[i] = s.nextInt();
        }

        if(size<2){
            System.out.println("Invalid inputs");
            return;
        }

        Arrays.sort(a);

        System.out.println(Arrays.toString(a));

        for(int i=size-2; i>=0 ; i--) {
            if (a[i] != a[size - 1]) {
                System.out.println("The second largest number in an array is: " + a[i]);
                return;
            }
        }

        System.out.println("There is no second largest number in an array...");
     }
}

