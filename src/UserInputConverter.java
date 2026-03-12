public class UserInputConverter {
    public static void main(String[] args) {
        // String to int
        String ageText = "25";
        int age = Integer.parseInt(ageText);
        System.out.println("Converted String to int: " + age);
        // int to String
        String ageString = Integer.toString(age);
        System.out.println("SConverted int to String: " + ageString);
        // int to Integer (boxing)
        Integer ageObject = Integer.valueOf(age);
        System.out.println("Boxed int to Integer object: " + ageObject);
        // Integer to int (unboxing)
        int unboxedAge = ageObject.intValue();
        System.out.println("Unboxed Integer to int: " + unboxedAge);
        // double example
        String priceText = "199.99";
        double pricw = Double.parseDouble(priceText);
        System.out.println("String to double: " + pricw);
        String priceString = Double.toString(pricw);
        System.out.println("Double to String: " + priceString);
    }
}
