package HashMaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hm2 {
    public static void main(String[] args){

        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"ram");
        hm.put(2,"Shyam");
        hm.put(3,"Ragini");

        Set<Map.Entry<Integer, String>> entry = hm.entrySet();
        Iterator<Map.Entry<Integer, String>> it = entry.iterator();

        for (Map.Entry<Integer, String> map:hm.entrySet()) {

            System.out.println(map.getKey()+" : "+map.getValue());

        }


        while (it.hasNext()){
            Map.Entry<Integer, String> e = it.next();
            hm.put(4,"Jeev");
            System.out.println(e.getKey()+" : "+e.getValue());
        }
    }
}
