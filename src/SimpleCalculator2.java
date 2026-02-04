public class SimpleCalculator2 {
    public static int add(int x, int y){
        return x + y; // returns the sum
    }
    public static void main(String[] args){
        int total = add(10, 20);
        System.out.println("The total is: " + total);
    }
}
