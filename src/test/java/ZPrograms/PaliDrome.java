package ZPrograms;

import java.util.Scanner;

public class PaliDrome {

    public static boolean is_Prime(String str){

        boolean flag = true;
        for (int i = 0; i < str.length()/2 ; i++) {
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                flag=false;
                break;
            }
        }

        return flag;
    }

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = s.nextLine();
        if(is_Prime(str)){
            System.out.println("The given string is palindrome ");
        }
        else {
            System.out.println("The given string is not palindrome..");
        }
    }
}
