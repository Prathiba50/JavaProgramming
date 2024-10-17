package InterviewQ1;

import java.util.Scanner;

public class StringTrim {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = s.nextLine();

        System.out.println(str.length());
        str = str.trim();
        System.out.println(str);
        System.out.println(str.length());

        System.out.println("Enter the 2nd String");
        String str2 = s.nextLine();
        System.out.println(str2.length());
        str2 = str2.replaceAll("\\s","");
        System.out.println(str2);
        System.out.println(str2.length());


    }
}
