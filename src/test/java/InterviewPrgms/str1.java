package InterviewPrgms;

public class str1 {
    public static void main(String[] args) {

        String a = "Hello";
        String b = "Hello";
        a = a.replace("l", "d");
        System.out.println(a);
        System.out.println(a==b);
        System.out.println( a.replace("l", "d").equals(b));

        String c = new String("Hello");
        String d = new String("Hello");

        System.out.println(c==d);
        System.out.println(c.equals(d));

        String s = "Hello";
        s = s+"world";
        System.out.println("-------------"+s);

        String s1 = "Hedword";
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(2,6));

    }
}
