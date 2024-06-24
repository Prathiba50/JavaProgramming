package Number_Theory;

import java.util.Scanner;

public class Factorial {

    public static int fact(int num){
        int i ;
        int fact = 1;

        for(i = 1 ; i<=num ; i++ ){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = s.nextInt();
        System.out.println("Enter the number: "+fact(n));
    }
}
