package ZPrograms;

public class SumANdAvg {

    public static void main(String[] args) {
        int[] a = {10,10,10,10};
        int sum = 0;
        for (int i = 0; i <a.length ; i++) {
            sum=sum+a[i];
        }
        int average = a.length > 0? sum/a.length:0;

        System.out.println("Sum: "+sum +" --> Average: "+average);
    }
}
