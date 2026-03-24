import java.io.FileReader;
import java.io.IOException;
public class SafeCalculator {
    public static void main(String[] args) {
        // Checked Exception Example
        try{
            FileReader reader = new FileReader("missing.txt");
            System.out.println("File opened successfully.");
        }
        catch (IOException e){
            System.out.println("Checked Exception: File not found.");
        }
        // Unchecked Exception Example
        int number = 10;
        try{
            int result = number / 0;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e){
            System.out.println("Unchecked Exception: Cannot divided by zero.");
        }
    }
}
