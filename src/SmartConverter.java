public class SmartConverter {
    public static void main(String[] args) {
        double doubleValue = 123.75;
        float floatValue = (float) doubleValue; // double -> float
        long longValue = (long) floatValue; // float -> long
        int intValue = (int) longValue; // long -> int
        short shortValue = (short) intValue; // int -> short
        byte byteValue = (byte) shortValue; // short -> byte
        System.out.println("Double value: " + doubleValue);
        System.out.println("Float value: " + floatValue);
        System.out.println("Long value: " + longValue);
        System.out.println("Int value: " + intValue);
        System.out.println("Short value: " + shortValue);
        System.out.println("Byte value: " + byteValue);
    }
}
