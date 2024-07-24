package Revisions;

public class Srt1 {
    public static void main(String[] args) {
        String str1 = "Prathibha";
        str1.concat("wer");

        String str2 = "Prathibha";

        System.out.println(str1.equals(str2));
        System.out.println(str1==str2);


        String s3 = new String("Deepa");
        s3.concat("ddn");
        String s4 = new String("Nishant");

        System.out.println(s3.equals(s4));
        System.out.println(s3==s4);


    }
}
