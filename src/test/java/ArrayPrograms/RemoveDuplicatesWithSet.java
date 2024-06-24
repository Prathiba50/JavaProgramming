package ArrayPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesWithSet {

    public static void removedupli1(Integer[] arr){
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        Integer[] b = set.toArray(new Integer[set.size()]);
        System.out.println(Arrays.toString(b));

    }

    public static void main(String[] args) {
        Integer a[] = {4,5,3,2,1,4,4,6,6,7,7,8,4,5,};
        removedupli1(a);


    }
}
