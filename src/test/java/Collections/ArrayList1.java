package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList1 {

    public static void main(String[] args){

        ArrayList<String> ls = new ArrayList<>();

        ls.add("Janu");
        ls.add("kerti");
        ls.add("ram");
        ls.add("Janani");

        //Traversing Arraylist with iterator
        Iterator it = ls.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        Collections.sort(ls);

        System.out.println("After sorting");
        for (String s : ls) {
            System.out.println(s);
        }
    }
}
