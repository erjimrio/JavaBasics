public class StaticCalculator {
    public static int add(int x, int y){
        return x + y;
    }
    public static int subtract(int x, int y){
        return x - y;
    }
    public static int multiply(int x, int y){
        return x * y;
    }
    public static void main(String[] args){
        System.out.println("Addition: " + add(10,5));
        System.out.println("Subtraction: " + StaticCalculator.subtract(20,8));
        System.out.println("Multiplication: " + multiply(4,7));
    }
}
