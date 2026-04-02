import java.util.LinkedList;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create LinkedList for Train Consist (Maintains Order)
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add Bogies (Initial Train Formation)
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Display Initial Consist
        System.out.println("\nInitial Train Consist:");
        System.out.println(trainConsist);

        // Insert Pantry Car at position 2 (index 2)
        trainConsist.add(2, "Pantry");

        System.out.println("\nAfter adding Pantry Car at position 2:");
        System.out.println(trainConsist);

        // Remove First and Last Bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // Final Consist
        System.out.println("\nFinal Train Consist after removals:");
        System.out.println(trainConsist);

        // Program continues...
        System.out.println("\nTrain sequence maintained successfully.");
    }
}
