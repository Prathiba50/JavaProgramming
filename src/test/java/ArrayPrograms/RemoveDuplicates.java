package ArrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {

        Integer[] a = {56,23,10,10,56,34,15};

        HashSet<Integer> set = new HashSet<>();

        for(Integer i : a){
            set.add(i);
        }

        StringBuilder sb = new StringBuilder();
        for (Integer ch : set) {
            sb.append(ch+",");
        }
        System.out.println(sb);

    }

}
