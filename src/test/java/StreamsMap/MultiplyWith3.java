package StreamsMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiplyWith3 {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(3,2,1,4,6);
        List<Integer> optList = new ArrayList<>();

        /*for(int i : num){
//            System.out.println(i*3);
            optList.add(i*3);
        }
        System.out.println(optList);*/

        optList= num.stream().map(n -> n*3).collect(Collectors.toList());
        System.out.println(optList);

        num.stream().map(n -> n*3).forEach(System.out::println);
    }
}
