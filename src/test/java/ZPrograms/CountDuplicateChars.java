package ZPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CountDuplicateChars {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = s.nextLine();

        Map<Character,Integer> map = new HashMap<>();

        for (char c: str.toCharArray()) {
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }

        for (Map.Entry<Character,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+ " : "+entry.getValue());
        }

        String str2 = s.nextLine();
        System.out.println("Enter the second string: ");

        Map<Character, Long> optStr = str.replaceAll("\\s", "").chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));


        System.out.println(optStr);

    }
}
