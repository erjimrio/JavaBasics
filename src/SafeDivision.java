public class SafeDivision {
    public static void main(String[] args) {
        int number = 10;
        int divisor = 0;
        try {
            int result = number / divisor;  // risky operation
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: You cannot  divide by zero!");
        }
        System.out.println("Program continues after handling the error.");
    }
}
