public class SmartCalculator {
    // add two integers
    public static int add(int a, int b){
        return a + b;
    }
    // add three integers
    public static int add(int a, int b, int c){
        return a + b + c;
    }
    // add two doubles
    public static double add(double a, double b){
        return a + b;
    }
    public static void main(String[] args){
        System.out.println("Sum of 2 integers: " + add(5, 10));
        System.out.println("Sum of 3 integers: " + add(5, 10, 15));
        System.out.println("Sum of 2 doubles: " + add(2.5 , 3.5));
    }
}
