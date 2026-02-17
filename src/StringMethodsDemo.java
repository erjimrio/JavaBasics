public class StringMethodsDemo {
    public static void main(String[] args) {
        String text = " Java Programming ";
        // using various methods
        System.out.println("Original:[" + text + "]");
        System.out.println("Length: " + text.length());
        System.out.println("Trimmed: [" + text.trim() + "]");
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Starts with 'Java': " + text.trim().startsWith("Java"));
        System.out.println("Ends with 'ing': " + text.trim().endsWith("ing"));
        System.out.println("Index of 'P': " + text.indexOf('P'));
        System.out.println("Character at index 5: " + text.charAt(4));
    }
}
