package ArrayPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet1 {

    public static void main(String[] args){

        HashSet hs = new HashSet();
//        Set hs1 = new HashSet();
//        HashSet<String>  hs2 = new HashSet<>();
        hs.add("Ram");
        hs.add('e');
        hs.add(100);
        hs.add('e');
        hs.add(null);
        hs.add(34.6);
        hs.add(100);

        System.out.println(hs.size());

        hs.stream().forEach(System.out::println);

        System.out.println(hs);
        System.out.println(hs.remove(100));
        System.out.println(hs);
        //Insertion is not possible cab set Collection
        //Accessing specific element is also not possible because it is not indexed based

        //We work around on it
        System.out.println("----------");
        ArrayList ls = new ArrayList(hs);
        System.out.println(ls);
        System.out.println(ls.get(3));

        System.out.println("----------");
        for (Object o : hs) {
            System.out.println(o);
        }

        System.out.println("------");
        Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        hs.clear();

        System.out.println(hs.isEmpty());
    }
}
