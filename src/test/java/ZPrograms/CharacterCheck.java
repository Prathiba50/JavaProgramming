package ZPrograms;

import java.util.Scanner;

public class CharacterCheck {

    public static boolean characterCheck(String str){
        str = str.toLowerCase();
        for(char i= 'a'; i <= 'z' ; i++){
            if(str.indexOf(i) == -1 ){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter the Stirng");
       String str = s.nextLine();
      // char[] ch = str.toCharArray();
       System.out.println(characterCheck(str));



    }
}
