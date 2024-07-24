package InterviewQuestionsP;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.function.Function;

public class ConvertLnkLstToMap {


        public static void main(String[] args) {
            LinkedList<String> linkedList = new LinkedList<>();
            linkedList.add("apple");
            linkedList.add("banana");
            linkedList.add("cherry");

            // Example custom function: Length of the string as key, string itself as value
            Function<String, Integer> keyMapper = String::length;

            Map<Integer, String> map = new HashMap<>();
            for (String item : linkedList) {
                map.put(keyMapper.apply(item), item);
            }

            System.out.println(map);
        }
    }


