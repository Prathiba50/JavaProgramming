package Revisions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CountDuplicateChars {

    public static void countDuplicates(String str){

        Map<Character,Integer> map = new HashMap<>();
        for (char c: str.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
//                map.put(c,map.getOrDefault(c,0)+1);
            }
            else {
                map.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    public static void countDupli(String str){
        Map<Character, Long> optStr = str.replaceAll("\\s", "").toLowerCase().chars()
                .mapToObj(m -> (char) m).collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        optStr.forEach((k,v)->{
            System.out.println(k+" : "+v);
        });
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String..");
        String str = s.nextLine();
        countDuplicates(str);

        System.out.println("Enter the second string..");
        String str2 = s.nextLine();
        countDupli(str2);

    }
}
