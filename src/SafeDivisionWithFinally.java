public class SafeDivisionWithFinally {
    public static void main(String[] args) {
        int number = 10;
        int divisor = 0;
        try {
            int result = number/divisor; // risky operation
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
        finally {
            System.out.println("Finally block: Cleaning up resources...");
        }
        System.out.println("Program continues after try-catch-finaly.");
    }
}
