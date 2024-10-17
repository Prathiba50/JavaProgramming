package Practiced_Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class RemoveDuplicatesFromArray {

    public static void main(String[] args){
        int a[] = {2,1,4,2,1,3,2};

        //Approach-1
       /* Set<Integer> set = new HashSet<>();

        for(int i : a){
            set.add(i);
        }
        int res[] = new int[set.size()];
        int index = 0;

        for(int j : set){
            res[index++]=j;
        }
        System.out.println(Arrays.toString(res));*/

        //Approach -2

        Arrays.sort(a);
        int temp[] = new int[a.length];
        int index = 0;
        for(int i=0; i < a.length-1; i++){
            if(a[i] != a[i+1]){
                temp[index++] = a[i];
            }
        }
        temp[index++]= a[a.length-1];
        System.out.println(Arrays.toString(Arrays.copyOf(temp,index)));

        //Approach - 3
        int b[] = {2,1,2,3,4,1,2,3,4,2,3,2,4,3};

        int uniqueArr[] = IntStream.of(b).distinct().sorted().toArray();

        System.out.println(Arrays.toString(uniqueArr));

    }
}
