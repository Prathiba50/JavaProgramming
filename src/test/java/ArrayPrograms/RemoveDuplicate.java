package ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

    public static void main(String[] args) {

        int[] a = {2, 5, 1, 4, 3, 5, 2};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for(int i=0; i < a.length; i++){
            set.add(a[i]);
        }

        System.out.println("After removing duplicates: "+set);
    }
}
