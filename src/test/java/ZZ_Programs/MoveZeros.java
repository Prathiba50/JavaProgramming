package ZZ_Programs;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {
         int a[] = {3,0,1,0,2};

         int index = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] != 0){
                a[index++] = a[i];
            }
        }
        while(index < a.length){
            a[index++]=0;
        }

        System.out.println(Arrays.toString(a));


        //Approach - 2
        int b[] = {3,0,6,7,0,8};

        for(int i = 0; i<b.length;i++) {
            if (b[i] == 0) {
                for (int j = i+1; j < b.length; j++) {
                    if (b[j] != 0) {
                        int temp = b[i];
                        b[i] = b[j];
                        b[j] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(b));
    }
}

