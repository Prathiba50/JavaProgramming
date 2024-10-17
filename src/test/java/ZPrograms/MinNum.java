package ZPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MinNum {
    public static void main(String[] args){
        int[] a = {5,3,7,0,8,9,3,4};
        int min = a[0];

        for(int i=0 ; i<a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println("Approch - 1: "+min);

        //Approach - 2
        int b[] = {9,3,5,6,1,0,3};

        Arrays.sort(b);
//        int i = b[b.length - (b.length )];
//        System.out.println("Approach - 2: "+b[i]);

        System.out.println(b[0]);

        //Approach -3
        int c[] = {90,34,25,6,17,8};

        List<Integer> optValue = Arrays.stream(c).boxed().sorted().collect(Collectors.toList());

        System.out.println("Approach - 3: "+optValue.get(0));

        //Approach - 4
        int d[] = {86,34,23,65,78,98,15};

        List<Integer> ls = new ArrayList<>(d.length);

        for (int i = 0; i < d.length; i++) {
            ls.add(d[i]);
        }

        Collections.sort(ls);
        System.out.println(ls);
        System.out.println("Approach - 4: "+ls.get(0));
    }
}
