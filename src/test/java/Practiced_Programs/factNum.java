package Practiced_Programs;

import java.util.Scanner;

public class factNum {

    public static int fact(int n){
        int fact = 1;
        for(int i=1 ; i<=n ; i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:..");
        int n = s.nextInt();
        System.out.println(fact(n));

    }
}
