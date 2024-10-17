package ZPrograms;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = s.nextLine();
        str = str.replaceAll("\\s","");
        System.out.println("Is String contains Vowels:  "+str.toLowerCase().matches(".*[aeiou].*"));
        int Vcount = 0;
        int Ccount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u'){
               Vcount++;
               System.out.print(ch);
            }
            else{
                Ccount++;
            }
        }
        System.out.println();
        System.out.println("Total number of vowels are: "+Vcount);
        System.out.println("Total number of consonants are: "+Ccount);
    }
}
