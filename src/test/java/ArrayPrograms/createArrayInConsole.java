package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class createArrayInConsole {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = s.nextInt();
        int a[] = new int[size];
        for (int i = 0; i < a.length ; i++) {
            a[i] = s.nextInt();
        }

        System.out.println("Print the Integer Array");
        System.out.println(Arrays.toString(a));
        for(int i=0; i< a.length; i++){
            System.out.println(a[i]);
        }
    }
}
