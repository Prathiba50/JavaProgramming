package String_Programs;

import java.util.Scanner;

public class ContainsMethod {

    public static  void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = s.nextLine();

        String s1 = s.nextLine();
        System.out.println(str.contains(s1));

        String s2 = s.nextLine();
        System.out.println(str.contains(s2));

    }
}
