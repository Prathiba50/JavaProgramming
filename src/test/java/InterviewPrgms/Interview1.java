package InterviewPrgms;

import java.util.ArrayList;

public class Interview1  {
    //Differences between mutable and immutable
    public static void main(String[] args) {

        //Immutable - Object can not be changed;
        String s = "java";
        System.out.println(s);
        s.concat(" is good");
        System.out.println(s);

        //Mutable
        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb);
        sb.append("is good");
        System.out.println(sb);

        ArrayList<String> list = new ArrayList<>();
        list.add("Selenium");
        list.add("java");
        list.add("API");

        CUstomImmutableClass c = new CUstomImmutableClass(1,"prathibha",4000000.78,"HBR LAyout", list);

        System.out.println(c.getSalary());


    }
}
