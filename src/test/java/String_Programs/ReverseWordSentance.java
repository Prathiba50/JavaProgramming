package String_Programs;

import java.util.Scanner;

public class ReverseWordSentance {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = s.nextLine();

        String[] words = str.split(" ");
        String revStr = "";
        for(int i=0; i<words.length;i++) {
            String word = words[i];
            String revWord = "";
            for (int j = word.length()-1;j >= 0; j--){
                revWord = revWord + word.charAt(j);
            }
            revStr= revStr+revWord+" ";
        }
        System.out.println("Reversed each word cab the sentence: "+revStr);
    }
}
