public class TypeCastingPlayground {
    public static void main(String[] args) {
        // Widening casting (automatic)
        byte byteValue = 50;
        int intValue = byteValue;
        double doubleValue = intValue;
        System.out.println("Byte to Int: " + intValue);
        System.out.println("Int to Double: " + doubleValue);
        // Narrowing casting (manual)
        doubleValue = 123.45;
        intValue = (int) doubleValue; // decimal part will be truncated
        byteValue = (byte) intValue; // may cause overflow if too large
        System.out.println("Double to Int: " + intValue);
        System.out.println("Int to Byte: " + byteValue);
        // Another example: float to long
        float floatValue = 99.99f;
        long longValue = (long) floatValue;
        System.out.println("Float to Long: " + longValue);
    }
}
