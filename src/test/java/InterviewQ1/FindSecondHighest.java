package InterviewQ1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindSecondHighest {

    public static void main(String[] args) {
     /*   int a[] = {1,4,2,3,4,9,9,8};

//        Arrays.sort(a);
//        System.out.println(Arrays.toString(a));

        Set<Integer> set = new HashSet<>();
        for(Integer i : a){
            set.add(i);
        }

        System.out.println(set);

        int arr[] = new int[set.size()];
        int index = 0;
        for(int j:set){
            arr[index++]= j;
        }
        int sec= arr.length-2;
        System.out.println(arr[sec]);*/

        //Find Duplicates

        System.out.println("--------------------");
        char ch[] = {'a','s','e','a','e','s','p',};

        Set<Character> set1 = new HashSet<>();

        for(char c: ch){
            if(!set1.add(c)){
                System.out.println(c);
            }
        }



    }
}
