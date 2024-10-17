package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNamesGreater6Lesser8 {
    public static void main(String[] args){
        List<String> ls = Arrays.asList("Jai","Kjasja","ksdsdjksa","prathibha","ram","shyam");

        System.out.println(ls.size());

        List<String> mdList = new ArrayList<>();
        mdList= ls.stream().filter(str -> (str.length() > 4 && str.length() < 10)).collect(Collectors.toList());
        System.out.println(mdList);

        long count = ls.stream().filter(str -> str.length() > 4 && str.length() < 10).count();
        System.out.println(count);

        mdList.forEach(System.out::println);//or
        System.out.println("----------------------  ");
        mdList.forEach(s -> System.out.println(s));


    }
}
