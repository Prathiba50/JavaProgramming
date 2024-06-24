package ArrayPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class findCommonElements {

    public static void fetchCommonElements(int[] arr1, int[] arr2){
        List<Integer> commonElements = Arrays.stream(arr1).filter(number -> Arrays.stream(arr2).anyMatch(arr2Number -> arr2Number == number))
                .boxed().collect(Collectors.toList());
        System.out.println(commonElements);
    }

    public static void main(String[] args) {
        int[] arr1 = {4,2,3,1,6};
        int[] arr2 = {3,9,7,5,6};
        fetchCommonElements(arr1, arr2);
    }


}
