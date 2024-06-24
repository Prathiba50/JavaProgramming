package ArrayPrograms;

import java.util.Arrays;

public class findSecondSmallest {

    public static void findSecondSmallest(int[] arr){
        int secondSmallestNumber = Arrays.stream(arr).distinct()
                .sorted().skip(1).findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Array does not have a second smallest number"));
        System.out.println("Second smallest number in an given array is: " +secondSmallestNumber);
    }

    public static void main(String[] args) {
        int[] arr = {5,2,4,1,1,3};
        findSecondSmallest(arr);
    }
}
