package String_Programs;

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CountDuplicateChars {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = s.nextLine();
        Map<Character, Long> outValues =str.replaceAll("\\s","").chars().mapToObj(
                c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        outValues.forEach((k, v)-> {

                System.out.println(k + " : "+v);

        });


    }
}
