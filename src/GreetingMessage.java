public class GreetingMessage {
    public static void main(String[] args){
        String greeting = "Hello, Java!"; //creating a String reference
        System.out.println("Original message: " + greeting);
        // using a method of the String class
        String upperGreeting = greeting.toUpperCase();
        System.out.println("Uppercase message: " + upperGreeting);
        // reference pointing to the same object
        String anotherGreeting = greeting;
        System.out.println("Another reference: " + anotherGreeting);
        // arrays as reference types
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        System.out.println("First number in array: " + numbers[0]);
    }
}