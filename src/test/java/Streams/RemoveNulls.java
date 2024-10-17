package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNulls {
    public static void main(String[] args) {

        List<String> ls = Arrays.asList(null,"gfgd","kllpd",null,"shyam","king",null);

        List<String> res = ls.stream().filter(w -> w != null).collect(Collectors.toList());

        res.forEach(System.out::println);
        System.out.println("------------------");
        res.forEach(s -> System.out.println(s));
        System.out.println("------------------");
        System.out.println(res);
    }
}
