package InterviewQuestionsP;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class ConvertLinkedListToMap {

    public static void main(String[] args) {
        LinkedList<String> ls1 = new LinkedList<>();
        ls1.add("sweet");
        ls1.add("sour");
        ls1.add("Bitter");

        LinkedList<String> ls2 = new LinkedList<>();
        ls2.add("Banana");
        ls2.add("StarFruit");
        ls2.add("Orange");

        Map<String, LinkedList<String>> map = new HashMap<>();

        map.put("List1",ls1);
        map.put("List2",ls2);

        System.out.println(map);

        System.out.println("Map before sorting...");
        for(Map.Entry<String, LinkedList<String>> entry : map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        Map<String, LinkedList<String>> sortedMap = new TreeMap<>(map);

        System.out.println("Map After sorting...");
        for(Map.Entry<String, LinkedList<String>> entry : sortedMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

}


