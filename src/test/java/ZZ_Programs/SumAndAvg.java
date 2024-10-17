package ZZ_Programs;

public class SumAndAvg {

    public static void main(String[] args) {
        int a[] = {10,10,20,20};

        int sum = 0;
        for(int i =0; i<a.length;i++){
            sum=sum+a[i];
        }
        int avg = a.length>0 ? sum/a.length:0;
        System.out.println(sum);
        System.out.println(avg);
    }

}
