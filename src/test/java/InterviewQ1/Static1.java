package InterviewQ1;

public class Static1 {
    static  int a = 20;
    static int b = 30;
    static int c = 40;

    Static1(){
        a=200;
    }
     static void m1(){
        b=300;
     }

     static{
        c = 400;
    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}
