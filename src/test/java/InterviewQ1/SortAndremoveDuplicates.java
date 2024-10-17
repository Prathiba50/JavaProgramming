package InterviewQ1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortAndremoveDuplicates {
    public static void main(String[] args) {

        int a[] = {4,2,5,6,1,1,6,3,3,4,4};
        int []opt = IntStream.of(a).distinct().sorted().toArray();
        System.out.println(Arrays.toString(opt));


        System.out.println(opt[opt.length-2]);
    }
}
