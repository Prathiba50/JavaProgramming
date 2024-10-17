package StreamsMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CovertToMap {

    public static void main(String[] args) {
        List<String> Vehicles = Arrays.asList("bus","flight","car","ship","byCycle");
        List<String> optList = new ArrayList<>();
       /* for (String s:Vehicles) {
           optList.add(s.toUpperCase());
        }
        System.out.println(optList);*/

        //Using Streams

        optList = Vehicles.stream().map(word -> word.toUpperCase()).collect(Collectors.toList());

        System.out.println(optList);
        optList.forEach(System.out::println);
    }
}
