public class StringComparisonDemo {
    public static void main(String[] args) {
        String storedPassword = "Secret123";
        String userInput = "secret123";
        // case-sensitive comparison
        boolean exactMatch = storedPassword.equals(userInput);
        System.out.println("Exact match: " + exactMatch);
        // case-insensitive comparison
        boolean ignoreCaseMatch = storedPassword.equalsIgnoreCase(userInput);
        System.out.println("Ignore case match: " + ignoreCaseMatch);
        // lexicographical comparison
        int comparisonResult = storedPassword.compareTo(userInput);
        System.out.println("CompareTo result: " + comparisonResult);
    }
}
