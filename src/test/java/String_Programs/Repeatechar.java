package String_Programs;

public class Repeatechar {
    public static void main(String[] args) {

        String s = "demo";
         for(int i=0;i<s.length();i++){
             for (int j =0; j<=i;j++){
                 System.out.print(s.charAt(i));
             }

         }
    }
}
