package LamdaExpressions;

public class LamdaRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Run method called");
    }
}

class ThreadLambdaExample{

    public static void main(String[] args) {
         Thread t = new Thread(new LamdaRunnable());
         t.start();

         Thread threadlamda = new Thread( () -> System.out.println("run method called using lamda"));
         threadlamda.start();

    }
}
