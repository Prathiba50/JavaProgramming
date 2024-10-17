package ZPrograms;

import java.util.Scanner;

public class RemoveSpecialChars {

    public static  String removeSpecialChars(String str){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if(Character.isLetter(ch) || Character.isDigit(ch) || Character.isWhitespace(ch)){
                sb.append(ch);
            }

        }
        return sb.toString();

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = s.nextLine();

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i< str.length();i++){
            char ch = str.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9') || ch == ' '){
                sb.append(ch);
            }
        }
        System.out.println("The original STring: "+str);
        System.out.println("The special characters removed string is: "+sb.toString());

        System.out.println("Enter the second String: ");

        String str2 = s.nextLine();
        System.out.println("After removing special characters: "+removeSpecialChars(str2));

        System.out.println("Enter the third string: ");
        String str3 = s.nextLine();

        System.out.println("Output string is: "+str3.replaceAll("[^a-zA-Z0-9 ]",""));
    }
}
