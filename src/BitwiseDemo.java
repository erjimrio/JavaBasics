public class BitwiseDemo {
    public static void main(String[] args){
        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary
        int andResult = a & b;
        int orResult = a | b;
        int xorResult = a ^ b;
        int notResult = ~a;
        int leftShift = a << 1;
        int rightShift = a >> 1;
        System.out.println("a= " + a + " (binary 0101)");
        System.out.println("b= " + b + " (binary 0011)");
        System.out.println("a & b= " + andResult);
        System.out.println("a | b= " + orResult);
        System.out.println("a ^ b= " + xorResult);
        System.out.println("~a= " + notResult);
        System.out.println("a << 1= " + leftShift);
        System.out.println("a >> 1= " + rightShift);
    }
}
