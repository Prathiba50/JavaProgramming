package InterviewQ1;

import java.util.Scanner;

public class PrintSpecialCharsLettersDigits {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = s.nextLine();

        StringBuilder letter = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder specialChars = new StringBuilder();

        for(int i = 0 ; i < str.length(); i++){
            char  c= str.charAt(i);
            if(Character.isDigit(c)){
                digits.append(c);
            }
            else if(Character.isLetter(c)){
                letter.append(c);
            }
            else {
                specialChars.append(c);
            }
        }

        System.out.println("Letters: "+letter);
        System.out.println("Digits: "+digits);
        System.out.println("Special characters: "+specialChars);

    }
}
