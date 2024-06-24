package ArrayPrograms;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArray {

    public static void reverseTheArray(int[] arr){
        int len = arr.length;
        IntStream.range(0,len/2).forEach(i -> {
            int temp = arr[i];
            arr[i] =arr[len-i-1];
            arr[len-i-1] = temp;
        });

        System.out.println("The reversed array is: "+ Arrays.toString(arr));

    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverseTheArray(arr);
    }

}
