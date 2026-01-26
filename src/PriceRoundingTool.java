public class PriceRoundingTool {
    public static void main(String[] args) {
        int basePrice = 50;
        System.out.println("Base price (int): " + basePrice);
        // Widening: int to double
        double exactPrice = basePrice;
        System.out.println("Exact price (double): " + exactPrice);
        // Adding decimal value
        exactPrice = exactPrice + 19.99;
        System.out.println("Updated exact price: " + exactPrice);
        // Narrowing: double to int
        int roundedPrice = (int) exactPrice;
        System.out.println("Rounded price (int): " + roundedPrice);
    }
}
