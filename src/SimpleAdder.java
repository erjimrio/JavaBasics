public class SimpleAdder {
    // method definition
    public static int add(int x, int y){
        int total = x + y;
        return total;
    }
    public static void main(String[] args){
        int sum = add(10, 20);
        System.out.println("The total is: " + sum);
    }
}
