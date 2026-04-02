import java.util.HashMap;
import java.util.Map;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create HashMap for Bogie → Capacity Mapping
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        // Insert Bogie Capacities
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 54);
        bogieCapacityMap.put("First Class", 24);
        bogieCapacityMap.put("Cargo Rectangular", 100);
        bogieCapacityMap.put("Cargo Cylindrical", 80);

        // Display Capacity Details using entrySet()
        System.out.println("\nBogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println(entry.getKey() + " → Capacity: " + entry.getValue());
        }

        // Program continues...
        System.out.println("\nCapacity mapping completed successfully.");
    }
}
