package ArrayPrograms;

import java.util.Arrays;

public class FindSecLargestIfThereAreDuplicates {

    public static void print2Large(int[] a){
        int size = a.length;

        if(size < 2){
            System.out.println("Invalid Input");
            return;
        }

        Arrays.sort(a);

        for (int i = size-2; i >= 0 ; i--) {
            if(a[i] != a[size-1]){
                System.out.println("The Second largest number is: "+a[i]);
                return;
            }
        }
        System.out.println("There is no Second Element....");

    }
    public static void main(String[] args) {
        int a[] = {4,2,1,3,5,5,2,6,6,6};
        print2Large(a);
    }
}
