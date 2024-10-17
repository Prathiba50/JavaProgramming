package ZPrograms;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class charCheck {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = s.nextLine();

        str = str.toLowerCase();

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < str.length() ; i++) {
            set.add(str.charAt(i));
        }

        for (char c = 'a'; c <= 'z' ; c++) {
            System.out.println(c + " : " + set.contains(c));

        }
    }
}
