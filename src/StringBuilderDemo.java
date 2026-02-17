public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Hello");
        builder.append(", ");
        builder.append("Liam");
        builder.append("!");
        builder.insert(6, "dear ");
        builder.replace(0, 5, "Hi");
        String finalMessage = builder.toString();
        System.out.println(finalMessage);
    }
}
