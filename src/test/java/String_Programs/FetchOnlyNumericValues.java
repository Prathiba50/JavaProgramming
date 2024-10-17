package String_Programs;

import jdk.jfr.internal.test.WhiteBox;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FetchOnlyNumericValues {

    public static void main(String[] args) {

        String str = "Order #13 - Value: 32.45$  type 10.00";
        Pattern pattern = Pattern.compile("\\d+.\\d+|\\d+");

        Matcher matcher = pattern.matcher(str);

        StringBuilder numValues = new StringBuilder();

        while (matcher.find()){
            if(numValues.length() > 0){
                numValues.append(" ");
            }
            numValues.append(matcher.group());
        }
        System.out.println(numValues);
    }

}
