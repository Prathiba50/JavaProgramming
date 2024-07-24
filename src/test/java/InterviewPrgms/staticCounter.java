package InterviewPrgms;

public class staticCounter {
    static int count = 0;

    public staticCounter(){
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args){
        staticCounter sc = new staticCounter();
        staticCounter sc1 = new staticCounter();

        System.out.println("Number of instance created: "+staticCounter.getCount());
    }
}
