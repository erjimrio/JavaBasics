public class SimpleInputParser {
    public static void main(String[] args) {
        // String to int
        String numberText ="100";
        int number = Integer.parseInt(numberText);
        System.out.println("String to int: " + number);
        // String to double
        String priceText = "59.99";
        double price = Double.parseDouble(priceText);
        System.out.println("String to double: " + price);
        // String to float
        String weightText = "72.5";
        float weight = Float.parseFloat(weightText);
        System.out.println("String to float: " + weight);
        // String to long
        String distanceText = "123456789";
        long distance = Long.parseLong(distanceText);
        System.out.println("String to long: " + distance);
        // String to boolean
        String activeText = "true";
        boolean isActive = Boolean.parseBoolean(activeText);
        System.out.println("String to boolean: " + isActive);
    }
}
