package String_Programs;

import org.omg.Messaging.SyncScopeHelper;

import java.util.*;

public class RemoveDuplicateChars {

    public static void removeDuplcates(String str){
        HashSet<Character> set1 = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for(char i: str.toCharArray()){
            if(!set1.contains(i)) {
                set1.add(i);
                result.append(i);
            }
        }

        System.out.println(result.toString());

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = s.nextLine();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        char[] ch =str.toCharArray();

        for(char c : ch){
            set.add(c);
        }

        for(char c : set){
            result.append(c);
        }
        System.out.println(result.toString());

        removeDuplcates("kanakala");
    }

}
