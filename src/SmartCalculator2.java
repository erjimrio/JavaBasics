public class SmartCalculator2 {
    public static void main(String[] args) {
        int [] numbers = {10, 20, 30};
        int index = 5;  // this will cause an array error
        int divisor = 0;  // this will cause a divide by zero error
        try {
            int result = numbers[index]/divisor;  // risky code
            System.out.println("Result: " + result);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: You tried to access an invalid array index.");
        }
        catch (ArithmeticException e) {
            System.out.println("Error: You tried to divide by zero.");
        }
        catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
        System.out.println("Program continues after handling the error.");
    }
}
