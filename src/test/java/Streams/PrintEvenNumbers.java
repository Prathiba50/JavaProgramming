package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrintEvenNumbers {

    public static void main(String[] args) {
         List<Integer> numbers = new ArrayList<>();
         numbers.add(3);
         numbers.add(4);
         numbers.add(6);
         numbers.add(1);
         numbers.add(7);
         numbers.add(2);

         List<Integer> evenNum = new ArrayList<>();

       /* for (int n:numbers) {
            if(n%2==0){
//                System.out.println(n);
                evenNum.add(n);
            }
        }
        System.out.println(evenNum);*/

        evenNum = numbers.stream().filter(n-> n%2==0).collect(Collectors.toList());
        System.out.println(evenNum);
//        numbers.stream().filter(n -> n%2==0).forEach(i -> System.out.println(i));
        //Also we can write above statement as below
        numbers.stream().filter(n-> n%2==0).forEach(System.out::println);


        System.out.println("-----------------------");
        //Just linear program
        int b[] = {3,2,5,4,6,7,1};

        for (int i = 0; i < b.length ; i++) {
            if(b[i]%2==0){
                System.out.print(b[i]+" ");
            }

        }
    }
}
