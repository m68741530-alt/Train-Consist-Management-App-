import java.util.LinkedHashSet;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for Train Formation
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Add Bogies (Insertion Order Maintained)
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to Add Duplicate
        trainFormation.add("Sleeper"); // duplicate, will be ignored

        // Display Final Formation
        System.out.println("\nFinal Train Formation (Insertion Order Preserved, No Duplicates):");
        System.out.println(trainFormation);

        // Program continues...
        System.out.println("\nTrain composition is safe and consistent.");
    }
}
