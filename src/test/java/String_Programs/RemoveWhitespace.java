package String_Programs;

import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveWhitespace {

    public static void main(String[] args) {
        //Approach-1 USing replaceALl()
        String s = "Have a good day";
        String str1 = s.replaceAll("\\s","");
        System.out.println("Approach-1: "+str1);

        //Approach-2 Using Character Class cab built functions

        String s1 = "wealcome to bangalore";
        String opStr = "";

        for(int  i=0;i< s1.length();i++){
            char ch = s1.charAt(i);
            if(!Character.isWhitespace(ch)){
                opStr = opStr+ch;
            }
        }
        System.out.println("Approach-2: "+opStr);

        //Approach-3 Using String.replace() method:

        String s2 = "I like java selenium  ";
        System.out.println("Approach-3: "+s2.replace(" ",""));

        //Approach-4 Using Java 8 Streams:
        String s3 = "Have a great day  ";
        String OutputStr = s3.chars().
               filter(c -> !Character.isWhitespace(c)).
                mapToObj(c -> String.valueOf((char) c)).
                collect(Collectors.joining());

        System.out.println("Approach-4: " +OutputStr);
    }
}


