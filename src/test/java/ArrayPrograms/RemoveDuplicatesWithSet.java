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

        int b[] = {3,1,2,5,4,3,5,3,5,4};

        System.out.println("---------------------------");
        Set<Integer> set1 = new HashSet<>();
        for (Integer i :b) {
            set1.add(i);
        }
        System.out.println(set1);

        int arr[] = new int[set1.size()];
        int index = 0;
        for (Integer i:set1) {
            arr[index++] = i;
        }
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
