package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args){

        //List myList = new ArrayList<>();
        ArrayList ls = new ArrayList<>();
        //ArrayList<Integer> ls1 = new ArrayList<>();

        ls.add("sam");
        ls.add(120);
        ls.add('d');
        ls.add(34.2);
        ls.add(null);
        ls.add("kushi");

        System.out.println("Extract using streams: ");
        ls.stream().forEach(System.out::println);

        System.out.println(ls.size());
        System.out.println(ls);
        System.out.println(ls.isEmpty());
        System.out.println(ls.remove(3));
        System.out.println(ls);
        ls.add(3,45.3);
        System.out.println(ls);
        System.out.println(ls.contains(null));

        System.out.println("------");
        System.out.println(ls.get(4));

        System.out.println("------");
        for(int i=0;i<ls.size();i++){
            System.out.println(ls.get(i));
        }
        System.out.println("------");
        for(Object ob : ls){
            System.out.println(ob);
        }

        System.out.println("------");
        Iterator it = ls.iterator();
        while(it.hasNext()){
//            ls.remove(null);//ConcurrentModificationException
            System.out.println(it.next());
        }

        //Remove multiple Elements at a time
        System.out.println("------");
        ArrayList ls2 = new ArrayList();
        ls2.add(120);
        ls2.add(null);


        ls.removeAll(ls2);
        System.out.println(ls);

        System.out.println("------");
        ls.addAll(4,ls2);
        System.out.println(ls);
    }
}
