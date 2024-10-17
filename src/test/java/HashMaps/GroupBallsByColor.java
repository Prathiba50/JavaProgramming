package HashMaps;
import java.util.*;

public class GroupBallsByColor {
    public static void main(String[] args) {
        // Example list of colors
        List<String> colors = Arrays.asList("Red", "Blue", "Red", "Green", "Blue", "Red");

        // HashMap to store grouped colors
        Map<String, List<String>> colorGroups = new HashMap<>();

        // Group colors
        for (String color : colors) {
            colorGroups.putIfAbsent(color, new ArrayList<>());
            colorGroups.get(color).add(color);
        }

        System.out.println(colorGroups);

        // Print the results
        System.out.println("Grouped Colors:");

        for (Map.Entry<String, List<String>> entry : colorGroups.entrySet()) {
            System.out.println("Color: " + entry.getKey() + ", Count: " + entry.getValue().size() + ", Balls: " + entry.getValue());
        }
    }
}
