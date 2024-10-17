package ZPrograms;

public class FindHighestUsingForEach {
    public static void main(String[] args) {
        int no[] = {10,20,50,40,30};
        int highest = no[0];
        for (int n:no) {
            if(n > highest){
                highest = n;
            }
        }
        System.out.println("The highest number cab an array is: "+highest);
    }
}
