package ZPrograms;

import java.util.Arrays;

public class ArrayInterviewPrg {
    public static void moveZeros(int a[]){
        int index = 0;
        for(int i= 0 ; i < a.length; i++){
            if(a[i] != 0){
                a[index++] = a[i];
            }
        }
        while (index < a.length){
            a[index++] = 0;
        }

    }
    public static void main(String[] args) {
       /* int arr[] = {1,0,5,0,9};
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));

        //Approach -2

        int b[] = {1,0,3,0,8};
        for(int i=0; i< b.length;i++){
            if(b[i] == 0)
            for(int j=i+1; j< b.length;j++){
                if(b[j] != 0){
                    int temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(b));*/


       /* int c[] = {3,0,1,0,7};
        int e[] = new int[0];
        int f[] = new int[0];

        for(int i=0; i< c.length;i++){
            if(c[i] == 0){

                for(int k = i+1; k < c.length-1;k++)
                e[k] = c[i];
            }

        }
//        int k[] = new int[]
        System.out.println(Arrays.toString(e));*/

    }
}
