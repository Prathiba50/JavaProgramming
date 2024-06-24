package Number_Theory;

import java.util.Scanner;

public class ArmStrong {

    public static int power(int x, int y){

        if(y==0)
            return 1;
        if(y % 2 == 0){
            return power(x,y/2)*power(x,y/2);
        }else
            return  x * power(x,y/2)*power(x,y/2);
    }

    public static int getOrder(int x){
        int n=0;
        while(x!=0){
            n++;
            x = x/10;
        }
        return n;
    }

    public static boolean isArmStrong(int num){
         int n = getOrder(num);
         int temp = num;
         int sum = 0;
         while (temp != 0){
             int r = temp%10;
             sum = sum + power(r, n);
             temp = temp/10;
         }
         if(sum == num){
             return true;
         }
         else
             return false;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = s.nextInt();
        System.out.println(n+ " : "+isArmStrong(n));


    }

}
