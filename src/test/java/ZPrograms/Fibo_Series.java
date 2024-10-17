package ZPrograms;

public class Fibo_Series {

    public static int fibo(int n){

        if(n <= 1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }

    public static void main(String args[]){

        for(int i =0; i<=20;i++ ){
            System.out.print(fibo(i)+",");
        }
    }
}
