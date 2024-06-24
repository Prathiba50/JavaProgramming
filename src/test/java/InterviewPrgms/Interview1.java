package InterviewPrgms;

public class Interview1 {
    //Differences between mutable and immutable
    public static void main(String[] args) {

        //Immutable - Object can not be changed;
        String s = "java";
        System.out.println(s);
        s.concat(" is good");
        System.out.println(s);

        //Mutable
        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb);
        sb.append("is good");
        System.out.println(sb);


    }
}
