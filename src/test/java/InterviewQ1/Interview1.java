package InterviewQ1;

public class Interview1 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        first:{
            second:{
            third:{
                if(x==y >> 1){
                    break second;
                }
            }
            System.out.println(x);
            }
            System.out.println(y);
        }

        int a = 6;
        int b = 7;

        System.out.println("a|b = "+(a|b));

        System.out.println("--------------------");
        int var1 = 5;
        int var2 = 6;

        if((var2 =1)== var1){
            System.out.println(var2);
        }else
            System.out.println(var2+1);

    }
}
