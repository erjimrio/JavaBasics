public class NumberChanger {
    public static void updateNumber(int value){
        value = 99; // change happens here
        System.out.println("Inside method: " + value);
    }
    public static void main(String[] args){
        int number = 25;
        System.out.println("Before method call: " + number);
        updateNumber(number);
        System.out.println("After method call: " + number);
    }
}
