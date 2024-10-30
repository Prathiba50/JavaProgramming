package ArrayPrograms;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDUpeAndSortAnArray {

    public static int removeDuplicates1(int[] a){
        if(a.length == 0){
            return 0;
        }
        Arrays.sort(a);
        int j = 0;

        for(int i =0; i<a.length;i++){

            if(a[i] != a[j]){
                j++;
                a[j] = a[i];
            }
        }
        return j+1;
    }

    public static void RemoveDuplicats2(int[] b){

        Set<Integer> set = new TreeSet<>();

        for(Integer a : b){
            set.add(a);
        }

        System.out.println(set);
        set.stream().forEach(System.out::println);
    }



    public static void main(String[] args) {

        int[] a = {3,1,2,4,4,5,1,6};

        int n = removeDuplicates1(a);

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
        System.out.println("--------------------------");
        int b[] = {4,3,2,1,6,3,4,5,5,3,4,2,4};
        RemoveDuplicats2(b);
        int bi[] = {4,2,3,51,4};
        RemoveDuplicats2(bi);


        System.out.println("--------From java8----------");
        int[] c = {2,1,4,3,5,6,3,4,2,1,2,4};

        List<Integer> ls =  Arrays.stream(c).boxed().distinct().sorted().collect(Collectors.toList());

        Integer[] arr = ls.toArray(new Integer[0]);

        System.out.println(Arrays.toString(arr));
        System.out.println("The second largest number is: "+arr[arr.length-2]);

    }
}
