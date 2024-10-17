package ArrayPrograms;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {

        Integer[] a = {56,23,10,10,56,34,15};

        Set<Integer> set = new TreeSet<>();

        for(Integer i : a){
            set.add(i);
        }

        set.stream().forEach(System.out::println);


        StringBuilder sb = new StringBuilder();
        for (Integer ch : set) {
            sb.append(ch+",");
        }
        System.out.println(sb);

    }

}
