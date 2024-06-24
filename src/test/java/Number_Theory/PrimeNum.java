package Number_Theory;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class PrimeNum {

    public static boolean is_Prime(int num){

        boolean flag = true;
        for(int i = 2 ; i < num/2; i++){
            if (num % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = s.nextInt();

        if(is_Prime(n)){
            System.out.println("Yes.."+n +" is prime number");
        }
        else
            System.out.println("No.."+n +" is not a prime number");


    }

    public static class RemoveDuplicatesUsingSet {

        public static  void RemoveDuplicates(int a[]){

            LinkedHashSet<Integer> set = new LinkedHashSet<>();

            for (int i = 0; i < a.length; i++) {
                set.add(a[i]);
            }
            System.out.println(set);
        }
        public static void main(String[] args) {
            int a[] = {4,2,1,5,3,5,};
            RemoveDuplicates(a);
        }


    }
}
