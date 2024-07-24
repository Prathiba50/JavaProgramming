package ArrayPrograms;

import java.util.Scanner;

public class create2dArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = s.nextInt();

        System.out.println("Enter the number of coloms: ");
        int cols = s.nextInt();

        int  a[][] = new int[rows][cols];

        System.out.println("Enter the elements of the array: ");

        for (int i =0; i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Element [" +i+"]["+j+"]");
                a[i][j] = s.nextInt();
            }
        }

        System.out.println("You entered:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
