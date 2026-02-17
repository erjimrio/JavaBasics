public class StringImmutabilityDemo {
    public static void main(String[] args) {
        String greeting = "Hello";
        System.out.println("Before change: " + greeting);
        // trying to modify the String
        greeting = greeting.concat(" Java");
        System.out.println("After concat (no reassignment): " + greeting);
    }
}
