package String_Programs;

public class Str1Validate {
    public static void main(String[] args) {
        String s1 = "Apple";
        String s2 = new String("Apple");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
//        System.out.println(s1>s2); CTE


        int result = s1.compareTo(s2);
        if(result < 0){
            System.out.println(result+" --> "+s1+" comes before "+s2);
        }
        else if(result == 0){
            System.out.println(result+" --> "+s1+ " is equal to "+s2);
        }else {
            System.out.println(result+" --> "+s1+ " comes after "+s2);
        }
    }
}
