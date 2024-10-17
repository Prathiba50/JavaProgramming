package ArrayPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AllInOne {

    //Find Second Smallest cab an Array
    public static void fetchSecondSmallest(int[] arr){
        int secSmallest = Arrays.stream(arr).sorted().skip(1).findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Array does not have second smallest number"));
        System.out.println("The second smallest number cab array is: "+secSmallest);
    }


    //Find Common elements from 2 Arrays
    public static void fetchCommonElements(int[] arr1, int[] arr2){
        List<Integer> CommonElements = Arrays.stream(arr1).filter(number -> Arrays.stream(arr2)
                .anyMatch(NumberArr2 -> NumberArr2 == number)).boxed().collect(Collectors.toList());
        System.out.println("All common elements are: "+CommonElements);
    }

    //Reverse of an Array
    public static void reverseTheArray(int[] arr){
        int len = arr.length;
        IntStream.range(0,len/2).forEach(i -> {
            int temp = arr[i];
            arr[i] =arr[len-i-1];
            arr[len-i-1] = temp;
        });

        System.out.println("The reversed array is: "+ Arrays.toString(arr));

    }

    //Find the longest length cab String
    public static void longestString(String[] Sarr){
        int max = Arrays.stream(Sarr).mapToInt(str -> str.length()).max().orElse(0);
        System.out.println("The longest length of the String is: "+max);
    }

    public static void main(String[] args) {
        int[] arr1 = {5,2,1,3,4};
        fetchSecondSmallest(arr1);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        int[] a1 = {5,2,6,3,1,4,6};
        int[] b1 = {4,2,6,3,1,7,0};
        fetchCommonElements(a1,b1);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        int[] arr2 = {6,3,2,4,1,8};
        reverseTheArray(arr2);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        String[] str = {"Banana","Mango","Orange","Avacado"};
        longestString(str);


    }
}
