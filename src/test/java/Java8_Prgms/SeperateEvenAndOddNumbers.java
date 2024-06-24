package Java8_Prgms;

import java.util.*;
import java.util.stream.Collectors;

public class SeperateEvenAndOddNumbers {

    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(8,9,3,4,1,7,6);

        Map<Boolean,List<Integer>> oddEvenNumbersMap =
                listOfIntegers.stream().
                        collect(Collectors.partitioningBy(i -> i%2 == 0));
        System.out.println(oddEvenNumbersMap);

        Set<Map.Entry<Boolean, List<Integer>>> entryset = oddEvenNumbersMap.entrySet();

        System.out.println(entryset);

        for(Map.Entry<Boolean, List<Integer>> entry : entryset){
            System.out.println("-----------------------");
            if(entry.getKey()){
                System.out.println("Even Numbers: ");
            }else{
                System.out.println("Odd Numbers");
            }
            System.out.println("-----------------------");

            List<Integer> list = entry.getValue();
            for (int i : list) {
                System.out.print(i+",");
                
            }
            System.out.println();
        }
    }
}
