public class AgeValidator {
    public static void main(String[] args) {
        int age = -5;  // invalid age
        try {
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative.");
            }
            System.out.println("Valid age: " + age);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("Program continues after handling the exception.");
    }
}
