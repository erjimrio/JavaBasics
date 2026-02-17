import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;
public class SetInterfaceDemo {
    public static void main(String[] args) {
        Set<String> guestList = new HashSet<>();
        //Set<String> guestList = new LinkedHashSet<>();
        // adding elements
        guestList.add("Emma");
        guestList.add("Liam");
        guestList.add("Olivia");
        guestList.add("Emma"); // duplicate
        // removing an element
        guestList.remove("Liam");
        // checking if an element exists
        boolean hasOlivia = guestList.contains("Olivia");
        System.out.println("Contains Olivia: " + hasOlivia);
        // displaying all elements
        System.out.println("Guest List: " + guestList);
    }
}
