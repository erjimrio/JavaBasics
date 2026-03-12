public class ResultPrinter {
    public static void main(String[] args) {
        int score = 250;
        double price = 19.99;
        float weight = 72.5f;
        long distance = 5000L;
        boolean isActive = true;
        char grade = 'A';
        // Conversion using String.valueOf()
        String scoreText = String.valueOf(score);
        String priceText = String.valueOf(price);
        String weightText = String.valueOf(weight);
        String distanceText = String.valueOf(distance);
        String activeText = String.valueOf(isActive);
        String gradeText = String.valueOf(grade);
        // Display the results
        System.out.println("Score: " + scoreText);
        System.out.println("Price: " + priceText);
        System.out.println("Weight: " + weightText);
        System.out.println("Distance: " + distanceText);
        System.out.println("Active: " + activeText);
        System.out.println("Grade: " + gradeText);
    }
}
