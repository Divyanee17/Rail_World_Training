package Day13;

import java.util.HashMap;
import java.util.Map;

public class MapClear {
    public static void main(String[] args) {
        // Create a HashMap and populate it with some key-value pairs
        Map<String, Integer> map = new HashMap<>();
        map.put("Devesh", 1);
        map.put("Hardeep", 2);
        map.put("Aayansh", 3);

        // Display the map contents
        System.out.println("Original map: " + map);

        // Clear the map
        map.clear();

        // Display the map contents after clearing
        System.out.println("Map after clear(): " + map);
    }
}