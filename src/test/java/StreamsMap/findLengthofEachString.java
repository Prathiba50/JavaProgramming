package StreamsMap;

import java.util.Arrays;
import java.util.List;

public class findLengthofEachString {

    public static void main(String[] args) {
        List<String >  vehicles = Arrays.asList("bus","Helicopter","train","Jeep","WorldShip","Cycle") ;

        vehicles.stream().map(word -> word.length()).forEach(System.out::println);

    }
}
