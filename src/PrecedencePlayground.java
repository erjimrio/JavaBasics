public class PrecedencePlayground {
    public static void main(String[] args){
        int a = 5;
        int b = 3;
        int c = 2;
        int result1 = a + b * c; // multiplication first
        int result2 = (a + b) * c; // parentheses change order
        boolean result3 = a > b && b < c; // relational before logical
        boolean result4 = a > b || b > c; // logical OR
        System.out.println("a + b * c = " + result1);
        System.out.println("(a + b) * c = " + result2);
        System.out.println("a > b && b < c = " + result3);
        System.out.println("a > b || b > c = " + result4);
    }
}
