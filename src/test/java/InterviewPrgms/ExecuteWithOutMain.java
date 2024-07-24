package InterviewPrgms;

public class ExecuteWithOutMain {
    static {
        System.out.println("static block is invoked");
        System.exit(0);
    }

    public static void main(String[] args) {
        System.out.println("main method");
    }


}
