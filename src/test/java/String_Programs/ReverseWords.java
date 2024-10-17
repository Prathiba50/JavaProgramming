package String_Programs;

import java.util.Scanner;

public class ReverseWords {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = s.nextLine();

        String[] words = str.split(" ");
        String rev = "";
        for (int i = words.length-1; i >=0 ; i--) {
            rev+=words[i]+" ";
        }
        System.out.println("Reversed scentanse is: "+rev);


    }
}
