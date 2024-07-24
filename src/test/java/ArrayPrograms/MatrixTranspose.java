package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixTranspose {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of rows...");
        int rows = s.nextInt();

        System.out.println("Enter the number of columns...");
        int cols = s.nextInt();

        int matrix[][] = new int[rows][cols];
        int transpose[][] = new int[cols][rows];

        System.out.println("Enter the data for the matrix:-");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = s.nextInt();
            }
        }

        System.out.println("Print input matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

//        System.out.println("Create transpose matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

//        //Approach-1 (n:n)
//        System.out.println("Approach-1 Print transpose matrix");
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                System.out.print(transpose[i][j]+" ");
//            }
//            System.out.println();
//        }

        //Approach-2
        System.out.println("Approach-2 Print the transpose matrix");
        for (int[] tr : transpose) {
            System.out.println(Arrays.toString(tr));
        }
    }
}
