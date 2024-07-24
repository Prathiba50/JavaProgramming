package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class Hm1 {

    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Prathibha");
        map.put(2,"Sushma");
        map.put(3,"Venkat");
        map.put(4,"Shweta");
        map.put(4,"ShwetaBasavaraj");
        map.put(5,"Gautham");

        System.out.println(map);

        System.out.println(map.get(4));

        System.out.println("Iterating hashMap:...");
        for (Map.Entry m1 : map.entrySet()) {
            System.out.println(m1.getKey()+" : "+m1.getValue());
        }
    }
}
