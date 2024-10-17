package String_Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxOccurrencesInString {
    static int  count =0;

    public static Map<Character,Integer> findMaxOccurence(String str){

        Map<Character,Integer> max = new HashMap<>();

        // Initialize max with the first character and its count
        max.put(str.charAt(0),str.length()-str.replace(String.valueOf(str.charAt(0)),"").length());

        // Iterate through the string to find the character with the maximum count
        for(char i : str.toCharArray()){
            count = str.length()-str.replace(String.valueOf(i),"").length();
            if(count > max.get(max.keySet().iterator().next())){
                max.clear();
                max.put(i,count);
            }
        }

        return max;
    }

  
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:..");
        String str = sc.nextLine();
        Map<Character,Integer> result = findMaxOccurence(str);
        System.out.println("Maximum Character cab a string is: "+result.keySet().iterator().next()+" Of times "+count);


    }
}
