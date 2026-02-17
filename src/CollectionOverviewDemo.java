import java.util.*;
public class CollectionOverviewDemo {
    public static void main(String[] args) {
        // List - stores ordered elements
        List<String> studentNames = new ArrayList<>();
        studentNames.add("Emma");
        studentNames.add("Liam");
        studentNames.add("Olivia");
        // Set - stores unique elements
        Set<Integer> studentIDs = new HashSet<>();
        studentIDs.add(101);
        studentIDs.add(102);
        studentIDs.add(103);
        // Map - stores key-value pairs
        Map<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Emma", 90);
        studentScores.put("Liam", 85);
        studentScores.put("Olivia", 95);
        // displaying the collections
        System.out.println("Student Names (list): " + studentNames);
        System.out.println("Students IDs (Set): " + studentIDs);
        System.out.println("Student Scores (Map): " + studentScores);
    }
}
