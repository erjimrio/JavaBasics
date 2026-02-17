public class StringConcatenationDemo {
    public static void main(String[] args) {
        String userName = "Liam";
        String greeting = "Welcome";
        String exclamation = "!";
        // using + operator
        String message = greeting + " " + userName + exclamation;
        System.out.println(message);
        // using concat method
        String altMessage = greeting.concat(" ").concat((userName)).concat(exclamation);
        System.out.println(altMessage);
    }
}
