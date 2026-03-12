public class AutoConverter {
    public static void main(String[] args) {
        byte smallNumber = 100;
        int intNumber = smallNumber; // byte -> int
        long longNumber = intNumber; // int -> long
        float floatNumber = longNumber; // long -> float
        double doubleNumber = floatNumber; // float -> double
        System.out.println("Byte value: " + smallNumber);
        System.out.println("Int value: " + intNumber);
        System.out.println("Long value: " + longNumber);
        System.out.println("Float value: " + floatNumber);
        System.out.println("Double value: " + doubleNumber);
    }
}
