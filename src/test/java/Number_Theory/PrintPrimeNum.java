package Number_Theory;

import java.util.Scanner;

public class PrintPrimeNum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the limit:");
        int limit = s.nextInt();

        System.out.println("Prime numbers between 1 to "+limit);

        for (int i = 1 ; i <= limit; i++){
            boolean flag = true;
            for (int j = 2; j < i ; j++) {
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                System.out.print(i+",");
            }
        }


    }
}
