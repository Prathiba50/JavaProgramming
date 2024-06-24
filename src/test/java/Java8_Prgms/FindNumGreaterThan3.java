package Java8_Prgms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindNumGreaterThan3 {

    public static void main(String[] args) {
        List<Integer> listofntegers = Arrays.asList(4, 6, 1, 2, 4, 3, 5, 8, 1);

        Map<Boolean, Long> num = listofntegers.stream().
                collect(
                        Collectors.partitioningBy(
                                i -> (i >= 3), Collectors.counting()));

        System.out.println(num);

        Map<Boolean, List<Integer>> optValue = listofntegers.stream()
                .collect(
                        Collectors.partitioningBy(
                                i -> (i > 4)));

        System.out.println(optValue);



    }
}
