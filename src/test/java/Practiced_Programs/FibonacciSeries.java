package Practiced_Programs;

import java.util.Scanner;

public class FibonacciSeries {

    public static int fibo(int i){

        if(i <= 1){
            return i;
        }
        return fibo(i-1)+fibo(i-2);
    }

    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Series that you required: ");
        int n = s.nextInt();
        for(int i=0;i<=n;i++){
            System.out.print(fibo(i)+" , ");
        }

        System.out.println();
        int a=0, b=1,c;

        for(int i=0; i<=10;i++){
            System.out.print(a+" , ");
            c=a+b;
            a=b;
            b=c;
        }

    }
}
