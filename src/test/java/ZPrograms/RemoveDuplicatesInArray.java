package ZPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesInArray {
    public static void main(String[] args){

        int[] a = {3, 2, 5, 4, 6, 1, 7, 8, 4, 2, 5, 2,1};

        Set<Integer> set = new HashSet<>();

        for(Integer i : a){
            set.add(i);
        }

        int[] res = new int[set.size()];
        int index = 0;
        for (int c:set) {
            res[index++] = c;
        }
        System.out.println("After removing duplicates: "+Arrays.toString(res));

    }
}
