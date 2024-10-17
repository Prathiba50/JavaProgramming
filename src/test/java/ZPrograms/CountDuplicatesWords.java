package ZPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountDuplicatesWords {

    public static void count(String str){

        String[] words = str.split(" ");

        Map<String, Integer> map = new HashMap<>();
        for (String s:words) {
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }
            else{
                map.put(s,1);
            }
        }

        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = s.nextLine();
        count(str);
    }
}
