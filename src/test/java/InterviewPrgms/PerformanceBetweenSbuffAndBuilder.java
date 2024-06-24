package InterviewPrgms;

public class PerformanceBetweenSbuffAndBuilder {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        System.out.println(startTime);

        StringBuffer sbf = new StringBuffer("Hello");

        for(int i = 0; i<1000000; i++){
            sbf.append("World");
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime);
        System.out.println(endTime-startTime +" Total time with String Buffer");

        startTime = System.currentTimeMillis();
        System.out.println(startTime);
        StringBuilder sbd = new StringBuilder("Hello");

        for (int i = 0; i < 1000000; i++) {
            sbd.append("World");
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime);
        System.out.println(endTime-startTime +" Total time with String Builder ");

    }
}
