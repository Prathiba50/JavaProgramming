package Practiced_Programs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FetchOnlyNum {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = s.nextLine();
        Pattern pat = Pattern.compile("\\d+\\.\\d+|\\d+");

        Matcher mat = pat.matcher(str);
        StringBuilder numValues = new StringBuilder();
        while (mat.find()){
            if(numValues.length() > 0){
                numValues.append(" ");
            }
            numValues.append(mat.group());
        }
        System.out.println(numValues.toString());

    }
}

