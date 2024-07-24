package String_Programs;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {

    public static String reverse(String string) {
        return Stream.of(string)
                .map(word->new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        String str = s.nextLine();
        String revstr = "";

        //Approch-1
        for(int i=str.length()-1;i>=0;i--){
            revstr = revstr+str.charAt(i);
        }
        System.out.println("Approch-1: "+revstr);

        //Approch-2
        String s1 = "testing";
        StringBuilder sb = new StringBuilder(s1);
        StringBuffer sbf = new StringBuffer();
        System.out.println("Approach-2: "+sb.reverse());

        //Approach-3
        String s2 = "Development";
        char[] ch = s2.toCharArray();
        String revstr2 = "";
        for(int i=ch.length-1;i>=0;i--){
            revstr2+=ch[i];
        }
        System.out.println("Approach-3: "+revstr2);


        //Approach-4
        String s3 = "Devops";
       String opstr =  Stream.of(s3).
                map(word->new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
       System.out.println("Approach-4: "+opstr);

    }

}
