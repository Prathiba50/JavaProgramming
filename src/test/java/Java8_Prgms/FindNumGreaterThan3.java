package Java8_Prgms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindNumGreaterThan3 {

    public static void main(String[] args) {
        List<Integer> listofIntegers = Arrays.asList(4, 6, 1, 2, 4, 3, 5, 8, 1);

        List<Integer> withoutDuplicate = new ArrayList<>();

        for(Integer  item : listofIntegers){
            if(!withoutDuplicate.contains(item)){
                withoutDuplicate.add(item);
            }
        }


        for (int i = 0; i < withoutDuplicate.size() ; i++) {
            if(withoutDuplicate.get(i) >= 3){
                System.out.println(withoutDuplicate.get(i));
            }

        }

        System.out.println("==============================");
        Map<Boolean, Long> num = listofIntegers.stream().
                collect(
                        Collectors.partitioningBy(
                                i -> (i >= 3), Collectors.counting()));

        System.out.println(num);

        Map<Boolean, List<Integer>> optValue = listofIntegers.stream()
                .collect(
                        Collectors.partitioningBy(
                                i -> (i > 4)));

        System.out.println(optValue);



    }
}
