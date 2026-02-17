public class ArrayAccessDemo {
    public static void main(String[] args) {
        int[] lockerNumbers = {101, 102,103,104, 105};
        // access and print elements
        System.out.println("First locker: " + lockerNumbers[0]);
        System.out.println("Third locker: " + lockerNumbers[2]);
        System.out.println("Fifth locker: " + lockerNumbers[4]);
        // modify an element
        lockerNumbers[2] = 999; // changing the third locker number
        // print after modification
        System.out.println("Updated third locker: " + lockerNumbers[2]);
    }
}
