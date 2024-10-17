package InterviewQ1;

import java.util.Map;
import java.util.TreeMap;

public class treemap12 {

    public static void main(String[] args){

        Map<Integer,String> map = new TreeMap<>();
        map.put(1,"Prathibha");
        map.put(2,"Ram");
        map.put(3,"Suresh");
        map.put(4,"JanviShyam");
        map.put(5,"Janaki");

        System.out.println("Print only Values");
        for(String s : map.values()){
            System.out.println(s);
        }

        System.out.println("Print only keys");
        for(Integer i: map.keySet()){
            System.out.println(i);
        }

        System.out.println("Print key value pairs");

        for(Map.Entry<Integer,String>  entry: map.entrySet()){
            System.out.println(entry.getKey()+ " : "+entry.getValue());
        }
    }
}
