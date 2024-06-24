package Number_Theory;

import java.util.Scanner;

public class fibo1 {
    public static void main(String[] args) {
        int a =0,b=1,c =1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the range of fibonacci series: " );
        int n = s.nextInt();


        for(int i =0; i<n;i++){
            System.out.print(a+" ");
            a = b;
            b = c;
            c = a+b;
        }
    }
}
