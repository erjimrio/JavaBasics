public class WelcomeMessage {
    public static void main(String[] args){
        String message = "Welcome to Java!";
        System.out.println("Original message: " + message);
        // Convert to uppercase
        String upperMessage = message.toUpperCase();
        System.out.println("Uppercase message: " + upperMessage);
        // Add another string
        String finalMessage = message + " Let's start coding.";
        System.out.println("Final message: " + finalMessage);
        // Get length of the string
        int length = message.length();
        System.out.println("Message length: " + length);
    }
}
