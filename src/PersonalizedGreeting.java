public class PersonalizedGreeting {
    public static void greetUser(String name, int age){
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
    }
    public static void main(String[] args){
        greetUser("Emma", 21);
        greetUser("Liam", 30);
    }
}
