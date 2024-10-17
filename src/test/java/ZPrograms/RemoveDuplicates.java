package ZPrograms;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = s.nextLine();
        StringBuilder result = new StringBuilder();
        Set<Character> set = new HashSet<>();

        for (char c:str.toCharArray()) {
            set.add(c);
        }

        for (char c:set) {
            result.append(c);
        }

        System.out.println(result.toString());
    }
}
