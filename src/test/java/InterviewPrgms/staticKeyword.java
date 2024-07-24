package InterviewPrgms;

public class staticKeyword {
    static int a =20;
    static String str;

    static void add(){
        System.out.println("static method");

    }

    static {
        System.out.println("static block");
    }

    public static void main(String[] args) {
        a =10;
        System.out.println(a);
        System.out.println(str);
        staticKeyword st = new staticKeyword();
        System.out.println(st.a);
        add();
        System.out.println("Main method");
    }
}
