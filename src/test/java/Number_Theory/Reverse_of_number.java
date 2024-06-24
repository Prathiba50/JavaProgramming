package Number_Theory;

import java.util.Scanner;

public class Reverse_of_number{

    public static int rev_num(int num){
        int temp = num;
        int rev = 0;
        while (temp != 0 ) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;

        }
        return  rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("reversed string is: "+rev_num(num));
    }

}
