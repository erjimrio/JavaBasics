public class StringSearchSubstringDemo {
    public static void main(String[] args) {
        String email = "student@example.com";
        // find the position of @
        int atIndex = email.indexOf("@");
        // extract substring from start to @
        String username = email.substring(0, atIndex);
        System.out.println("Email: " + email);
        System.out.println("Username: " + username);
    }
}
