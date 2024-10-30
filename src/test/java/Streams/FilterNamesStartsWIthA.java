package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNamesStartsWIthA {

    public static void main(String[] args){

        List<String> names = new ArrayList<>();
        names.add("Abjit");
        names.add("Don");
        names.add("Alekya");
        names.add("Shyam");
        names.add("Apsara");

        int count =0;
        for(int i=0; i<names.size();i++){
            String actual = names.get(i);
            if(actual.startsWith("A")){
                System.out.println(actual);
                count++;
            }
        }
        System.out.println("Total number of names which are starts from letter A..:"+count);

        List<String> modifiedList = new ArrayList<>();

        modifiedList = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
        System.out.println("The names will be starts with A "+ modifiedList+ "and count is "+modifiedList.size());

        modifiedList.forEach(name -> System.out.println(name));
    }
}
