package ZPrograms;

public class FilterPaliString {
    public static boolean is_pali(String str){

        boolean flag = true;
        for (int i = 0; i < str.length()/2 ; i++) {
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                flag=false;
                break;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        String s = "abastyuiop anna uiopty unnu";
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if(is_pali(word)) {
                System.out.println(word + " - is palindrome" );
            }
            else {
                System.out.println(word + " - is not palindrome" );
            }
        }
    }
}
