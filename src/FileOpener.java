import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileOpener {
    public static void main(String[] args) {
        try {
            openFile(); // method might throw an IOException
        }
        catch (IOException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
        System.out.println("Program continues after handling the exception.");
    }

    public static void openFile() throws IOException {
        FileReader reader = new FileReader("non_existing_file.txt");
        System.out.println("File opened successfully!");
    }
}
