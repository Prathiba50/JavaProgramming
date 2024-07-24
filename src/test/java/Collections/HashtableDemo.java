package Collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashtableDemo {

    public static void main(String[] args) {

//        Hashtable t = new Hashtable(); // Default capacity is 11, Load factor is 0.75
//
//        //Create a hashtable with an initial capacity of 20
//        Hashtable<String, Integer> hashtable = new Hashtable<>(20);

//        //Create a hashtable with an initial capacity and load factor
//        Hashtable<Integer,String> ht = new Hashtable<>(20,0.90);

        Hashtable<Integer,String> hm1 = new Hashtable<>();

        hm1.put(1,"Prathibha");
        hm1.put(2,"Arathi");
        hm1.put(3,"Jayash");
//        hm1.put(null,"Yaseen"); //NullPointerException
//        hm1.put(4,null);         // NullPointerException

        System.out.println(hm1); //{3=Jayash, 2=Arathi, 1=Prathibha}

        System.out.println(hm1.remove(2) +" is removed from the Hashtable");

        System.out.println(hm1); //{3=Jayash, 1=Prathibha}

        System.out.println("Contains Keys........");

        System.out.println(hm1.contains("Jayash")); //true
        System.out.println(hm1.containsKey(3));        //true
        System.out.println(hm1.containsKey(2));        //false

        System.out.println("Contains Values......");

        System.out.println(hm1.containsValue("Arathi"));
        System.out.println(hm1.containsValue("Prathibha"));

        hm1.put(6,"Ragini");

        System.out.println(hm1.keySet());
        System.out.println(hm1.values());

        //Extract individual values from the set
        for (int t :hm1.keySet()) {
//            System.out.println(t); //Only keys we can fetch
            System.out.println(t + " " +hm1.get(t)); //Based on key we can fetch Values
        }

        //Extract only values
        for(String s : hm1.values()){
            System.out.println(s); // only values we can fetch
//            System.out.println(s +" "+hm1.get(s));// Based on value we can not fetch keys will get null
        }

        //Using Entry Specific methods...
        System.out.println("Entry Specific methods");
        for(Map.Entry entry : hm1.entrySet()){
            System.out.println(entry.getKey() + " " +entry.getValue());
        }

        //Extracting all entries Using Iterator
        System.out.println("Extracting entries using Iterator");
        Set<Map.Entry<Integer,String>> s = hm1.entrySet();

        Iterator<Map.Entry<Integer, String>> itr = s.iterator();

        while(itr.hasNext()){
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println(entry.getKey() +" "+entry.getValue());

        }

      /* Set s1 = hm1.entrySet();
        Iterator itr1 = s1.iterator();

        while(itr1.hasNext()){
          Map.Entry  entry = (Map.Entry) itr1.next();
          System.out.println(entry.getKey() +" "+entry.getValue());
        }*/



    }
}
