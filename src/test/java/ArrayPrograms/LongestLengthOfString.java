package ArrayPrograms;

import java.util.Arrays;

public class LongestLengthOfString {

    public static void findLongestLengthString(String[] Sarr){
        int max = Arrays.stream(Sarr).mapToInt(str -> str.length()).max().orElse(0);
        System.out.println("Length of the longest string is: "+max);

    }



    public static void main(String[] args) {
        String[] str = {"banana","Avocado","Butterfruite","grapes","Mango"};
        findLongestLengthString(str);

    }
}
