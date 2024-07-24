package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer,String> m = new HashMap<>();

        m.put(1,"Prathibha");
        m.put(1,"Suresh");
        m.put(2,"Shaila");
        m.put(3,"Nishant");
        m.put(4,"Bharath");
        m.put(null,"Ramesh");
        m.put(null,"Gautham");
        m.put(5,"Sushma");
        m.put(6,null);
        m.put(7,null);
        m.put(8,null);

        System.out.println(m);

        System.out.println(m.remove(6)+" is removed");

        System.out.println(m);
        System.out.println(m.isEmpty());
        System.out.println("Contains Key method...");

        System.out.println(m.containsKey(5)); //true
        System.out.println(m.containsKey(10)); //false

        System.out.println("Contains Value method...");

        System.out.println(m.containsValue("Shaila"));  //true
        System.out.println(m.containsValue("Prathibha")); //fasle

        System.out.println("set of keys");
        System.out.println(m.keySet());

        System.out.println("Set of values");
        System.out.println(m.values());

        System.out.println("Extract only keys fro the hashMap");
        for(Object k : m.keySet()) {
            System.out.println(k);
        }

        System.out.println("Extract the values with keys");
        for(Object k : m.keySet()){
            System.out.println(k +" "+m.get(k));
        }

        System.out.println("Extract only values from the HashMap");
        for(Object v : m.values()){
            System.out.println(v);
        }

        //Entry Specific methods
        System.out.println("Entry specific methods");

        for(Map.Entry<Integer,String> entry : m.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        //Extracting entries using iterator

        Set<Map.Entry<Integer,String>> s = m.entrySet();
        Iterator<Map.Entry<Integer,String>> itr = s.iterator();
        while(itr.hasNext()){
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

}
