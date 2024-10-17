package ZPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Add2ArraysUsingCollections {
    public static void main(String[] args){
        Integer arr1[] = {2,3,4,5};
        Integer arr2[] = {9,8,7,6} ;

        List<Integer> list1 = new ArrayList<>(Arrays.asList(arr1));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(arr2));

        list1.addAll(list2);

        System.out.println(list1);
    }
}
