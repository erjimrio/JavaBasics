public class MeasurementConverter {
    public static void main(String[] args) {
        // Widening examples
        byte smallUnit = 10;
        int mediumUnit = smallUnit; //byte -> int
        double largeInit = mediumUnit; // int -> double
        System.out.println("Byte to Int: " + mediumUnit);
        System.out.println("Int to Double: " + largeInit);
        // Narrowing examples
        double distance = 123.987;
        int roundedDistance = (int) distance; // double -> int
        short shortDistance = (short) roundedDistance; // int -> short
        System.out.println("Double to Int (truncated): " + roundedDistance);
        System.out.println("Int to Short: " + shortDistance);
        // Another example: float to byte
        float weight = 75.9f;
        byte weightByte = (byte) weight; // narrowing, may lose data
        System.out.println("Float to Byte: " + weightByte);
    }
}
