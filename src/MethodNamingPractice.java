public class MethodNamingPractice {
    public static void displayWelcomeMessage(){
        System.out.println("Welcome to Java Programming!");
    }
    public static int findMaxNumber(int a, int b){
        return (a > b)?a:b;
    }
    public static void printGoodbye(){
        System.out.println("Goodbye!");
    }
    public static void main(String[] args){
        displayWelcomeMessage();
        int max = findMaxNumber(10,25);
        System.out.println("The maximum number is: " + max);
        printGoodbye();
    }
}
