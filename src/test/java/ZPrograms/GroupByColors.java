package ZPrograms;

import java.util.*;

public class GroupByColors {
    public static void main(String[] args){
        List<String> colors = Arrays.asList("red", "blue", "red", "green", "green", "blue", "red");

        Map<String,List<String>> groupColors = new HashMap<>();

        for (String color:colors) {
            groupColors.putIfAbsent(color,new ArrayList<>());
            groupColors.get(color).add(color);
        }

        System.out.println("Grouped colors are: ");
        for(Map.Entry<String ,List<String>> entry: groupColors.entrySet()){
            System.out.println("color: "+entry.getKey() +" count: "+entry.getValue().size()+" Balls: "+entry.getValue());
        }
    }
}
