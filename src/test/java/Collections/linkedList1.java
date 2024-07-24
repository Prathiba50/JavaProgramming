package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedList1 {
    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        ls.add(2);
        ls.add("Swetha");
        ls.add(10.9);
        ls.add("Selva");
        ls.add('a');

        System.out.println(ls);

        for (int i = 0; i < ls.size() ; i++) {
            System.out.println(ls.get(i));
        }

        Iterator it = ls.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }





    }
}
