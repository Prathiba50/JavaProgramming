package ArrayPrograms;

import java.util.Arrays;

public class FindSecondLarget {

    public static void main(String[] args) {
        int a[] = {10,10,5};
        int size = a.length;

        if(size < 2){
            System.out.println("Invalid input");
            return;
        }
        Arrays.sort(a);

        for(int i=size-2; i>=0; i--){
            if(a[i] != a[size-1]){
                System.out.println("The second largest number is: "+a[i]);
                return;
            }
        }
        System.out.println("There is no second largest number:...");
    }
}
