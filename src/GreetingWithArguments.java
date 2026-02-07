public class GreetingWithArguments {
    public static void greetUser(String name, int age){
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
    }
    public static void main(String[] args){
        greetUser("Liam", 25); // passing arguments directly
        String userName = "Sophia";
        int userAge = 30;
        greetUser(userName, userAge); // passing variables as arguments
    }
}
