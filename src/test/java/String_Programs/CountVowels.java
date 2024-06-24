package String_Programs;

import java.util.Scanner;

public class CountVowels {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = s.nextLine();

        System.out.println("Is string contains vowels?:  " +str.toLowerCase().matches(".*[aeiou].*"));

        String str1 = str.toLowerCase();
        int Vcount = 0, cCount = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o' || str1.charAt(i) == 'u') {
                Vcount++;
            } else if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z') {
                cCount++;
            }
        }
        System.out.println("Total number of Vowels in given string are: "+Vcount);
        System.out.println("Total number of consonants in given string are: "+cCount);
        }
}


