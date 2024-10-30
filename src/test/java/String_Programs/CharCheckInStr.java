package String_Programs;

import java.util.Scanner;

public class CharCheckInStr {

    public static boolean charCheck(String str){
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         System.out.println("Enter the String: ");
         String str = s.nextLine();

         System.out.println(charCheck(str));

         System.out.println("Enter the Second String");
         String str2 = s.nextLine();

         for(char ch = 'a'; ch <= 'z'; ch++){
             if(str2.indexOf(ch) != -1){
//                 System.out.println(ch + " is present");
                    System.out.println(true);
             }
             else {
//                 System.out.println(ch+ " is not present");
                 System.out.println(false);
             }
         }

    }
}
