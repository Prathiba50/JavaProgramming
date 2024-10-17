package ZPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MaxNum {

    public static void main(String args[]) {
        //Approach-1
        int a[] = {4, 2, 3, 1, 6, 4};

        int max = a[0];

        for(int i=0 ; i<a.length ;i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.println(max);

        //Approach -2;
        int[] b = {3,4,2,5,6,7,1};

        Arrays.sort(b);
        System.out.println(Arrays.toString(b));

        System.out.println(b[b.length-1]);

        //Approach - 3

        int[] c = {4,7,2,5,4,9,1};
        List<Integer> optArr = Arrays.stream(c).boxed().sorted().collect(Collectors.toList());
        System.out.println(optArr);
//        optArr.forEach(System.out::println);
        System.out.println(optArr.get(optArr.size() - 1));

        //Approach - 4
        int[] d = {90,20,30,10,50,40};

        List<Integer> ls = new ArrayList<>(d.length);

        for (int n : d ) {
            ls.add(n);
        }

        Collections.sort(ls);

        System.out.println(ls);
        System.out.println(ls.get(ls.size()-1));
    }
}
