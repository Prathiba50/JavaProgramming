package InterviewQ1;

public class TryCatchSystemExit {

    public static void main(String[] args){

        try{
            int a = 100/4;
            System.out.println("In try");
            System.exit(0);

        }
        catch (Exception ex){
            System.out.println("cab catch");
        }
        finally {
            System.out.println("I am cab finally block..");
        }
    }
}
