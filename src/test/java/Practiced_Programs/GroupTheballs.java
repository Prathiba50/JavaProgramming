package Practiced_Programs;

import java.util.*;

public class GroupTheballs {

    public static void main(String[] args){

        String[] balls = {"red","green","Yellow","green","red","red"};

        List<String>  colorBalls = new ArrayList<>(Arrays.asList(balls));

        Map<String, List<String>> groupBalls = new HashMap<>();

        for(String color : colorBalls){
            groupBalls.putIfAbsent(color, new ArrayList<>());
            groupBalls.get(color).add(color);
        }

        for (Map.Entry<String, List<String>> entry : groupBalls.entrySet()) {
            System.out.println(entry.getKey()+" : count => "+entry.getValue().size()+" "+entry.getValue());
        }

    }
}

