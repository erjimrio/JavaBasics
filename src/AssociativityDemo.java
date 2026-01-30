public class AssociativityDemo {
    public static void main(String[] args){
        int result1 = 10 - 5 - 2; // left-to-right
        int result2 = 2 * 3 * 4; // left-to-right
        int a,b,c;
        a = b = c = 10; // right-to-left
        boolean logic = true || false && false; // precedence + associativity
        System.out.println("10 - 5 - 2 = " + result1);
        System.out.println("2 * 3 * 4 = " + result2);
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("true || false && false = " + logic);
    }
}
