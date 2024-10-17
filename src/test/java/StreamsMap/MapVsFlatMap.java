package StreamsMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapVsFlatMap {
    public static void main(String[] args){

        //Map
        List<Integer> numbers = Arrays.asList(2,1,3,4,2,4,5);
        List<Integer> optList = new ArrayList<>();

        for (int i : numbers) {
            optList.add(i+10);
        }
        System.out.println(optList);

        numbers.stream().map(n -> n+10).forEach(System.out::println);

        System.out.println("-----------Flatmap-----------");

        //FlatMap
        List<Integer> ls1 = Arrays.asList(10,20);
        List<Integer> ls2 = Arrays.asList(30,40);
        List<Integer> ls3 = Arrays.asList(50,60);

        List<List<Integer>> numbersList = Arrays.asList(ls1,ls2,ls3);

//        optList = numbersList.stream().flatMap(x -> x.stream());

    }
}
