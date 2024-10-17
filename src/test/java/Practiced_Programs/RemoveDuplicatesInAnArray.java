package Practiced_Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesInAnArray {

    public static void main(String[] args) {
        char a[] = {'a','s','c','c','s'};

        Set<Character> set = new HashSet<>();

        for(char c : a){
            set.add(c);
        }

        char[] res = new char[set.size()];
        int index =0;
        for(char c: set){
            res[index++] = c;
        }

        System.out.println(Arrays.toString(res));
    }
}
