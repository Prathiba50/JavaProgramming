package InterviewQ1;

public class StaticKeyword {

    private  int x = 10;
     static int m1()
     {
         StaticKeyword s = new StaticKeyword();
        int y = s. x;
        return y;
     }

     public static void main(String[] args){
         System.out.println(m1());
     }
}
