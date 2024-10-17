package Practiced_Programs;

import java.util.Scanner;

public class RemoveSpecialCharacters {

    public static String remove_spec(String str){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isLetter(ch) || Character.isDigit(ch) || Character.isDigit(ch)){
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = s.nextLine();

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if((ch>='a' && ch<='z') || (ch >='A' && ch <= 'Z') || (ch>='0' && ch<='9')|| ch == ' '){
                sb.append(ch);
            }
        }
        System.out.println("After removing all special characters cab string is: "+sb);
        System.out.println("Enter the second String");
        String str2 = s.nextLine();

        System.out.println("After removing special characters: "+remove_spec(str2));

    }
}
