package Practiced_Programs;

import java.util.Scanner;

public class Palindrome {

    public static boolean is_pali(String str){

        boolean flag = true;
        str = str.toLowerCase();

        for(int i=0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                flag = false;
            }
        }

        return flag;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = s. nextLine();

        if(is_pali(str)){
            System.out.println("Yes given string is palindrome");
        }else{
            System.out.println("No it is not palindrome");
        }

    }
}
