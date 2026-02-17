import java.util.Arrays;
public class ArraySortSearchDemo {
    public static void main(String[] args) {
        int[] scores = {75, 90, 60, 85, 70};
        // sort the array
        Arrays.sort(scores);
        System.out.println("Sorted scores:");
        for (int score: scores){
            System.out.println(score);
        }
        // Search for a specific score
        int target = 85;
        int index = Arrays.binarySearch(scores, target);
        if(index>=0){
            System.out.println(target + " found at index: " + index);
        }
        else {
            System.out.println(target + "not found in the array.");
        }
    }
}
