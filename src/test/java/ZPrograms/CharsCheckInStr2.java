package ZPrograms;

import java.util.Scanner;

import static java.lang.String.*;

public class CharsCheckInStr2 {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string..");
        String str = s.nextLine();


        for (char i = 'A'; i <= 'Z'; i++) {
                if(str.toUpperCase().indexOf(i) < 0){
                    System.out.print(i+" ");
                }
        }
    }
}
