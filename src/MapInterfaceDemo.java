import java.util.Map;
import java.util.HashMap;
public class MapInterfaceDemo {
    public static void main(String[] args) {
        Map<String, Integer> studentScores = new HashMap<>();
        // adding key-value pairs
        studentScores.put("Emma", 90);
        studentScores.put("Liam", 85);
        studentScores.put("Olivia", 95);
        // retrieving a value using key
        int emmaScore = studentScores.get("Emma");
        System.out.println("Emma's score: " + emmaScore);
        // updating a value
        studentScores.put("Liam", 88);
        // removing a key-value pair
        studentScores.remove("Olivia");
        // checking if a key exists
        boolean hasEmma = studentScores.containsKey("Emma");
        System.out.println("Contains Emma: " + hasEmma);
        System.out.println("Updated Scores: " + studentScores);
    }
}
