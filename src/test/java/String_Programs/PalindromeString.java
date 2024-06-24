package String_Programs;

import java.util.Scanner;

public class PalindromeString {
    public static boolean isPali(String input){
        String s = input.toLowerCase();
         boolean flag = true;

         for(int i=0;i<s.length()/2;i++){
             if(s.charAt(i) != s.charAt(s.length()-i-1)){
                 flag = false;
                 break;
             }
         }

        return flag;
    }

    public static boolean isPali1(String str){
        int i=0,j=str.length()-1;

        while (i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();
        if(isPali(str)) {
            System.out.println("Yes String is palindrome");
        }else
            System.out.println("NO String is not palindrome");


    }
}
