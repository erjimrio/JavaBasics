public class StringBuilderDeclarationDemo {
    public static void main(String[] args) {
        // declare and initialize with empty text
        StringBuilder greeting = new StringBuilder();
        greeting.append("Hello");
        greeting.append(", ");
        greeting.append("Maria!");
        // declare and initialize with initial text
        StringBuilder quickGreeting = new StringBuilder("Hi John!");
        System.out.println("Custom greeting: " + greeting.toString());
        System.out.println("Quick Greeting: " + quickGreeting.toString());
    }
}
