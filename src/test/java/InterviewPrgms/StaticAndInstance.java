package InterviewPrgms;

public class StaticAndInstance {

    int a =10;
    static int b =20;


    public void print(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void display(){
//        System.out.println(StaticAndInstance.a);  We can not access the instance variables inside static block
    }

    public static void main(String[] args) {
        int b = 25;
//        System.out.println(a);  We can not access the instance variables inside static block
        System.out.println(b);

        StaticAndInstance s = new StaticAndInstance();

        System.out.println(s.a);
        System.out.println(s.b);
        System.out.println(b);


    }
}
