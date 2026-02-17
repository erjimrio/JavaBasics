import java.util.List;
import java.util.ArrayList;
public class ListInterfaceDemo {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        // adding elements
        nameList.add("Emma");
        nameList.add("Liam");
        nameList.add("Olivia");
        nameList.add("Liam"); // duplicates allowed
        //accessing elements
        System.out.println("First name: " + nameList.get(0));
        System.out.println("Second name: " + nameList.get(1));
        // removing an element
        nameList.remove(2);
        //updating an element
        nameList.set(1, "Noah");
        // displaying all elements
        System.out.println("Updated List: " + nameList);
    }
}
