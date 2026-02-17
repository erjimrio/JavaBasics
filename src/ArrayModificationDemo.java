public class ArrayModificationDemo {
    public static void main(String[] args) {
        int[] lockerNumbers = {101,102,103,104,105};
        // print original values
        System.out.println("Original third locker: " + lockerNumbers[2]);
        // modify the third locker
        lockerNumbers[2] = 999;
        System.out.println("Updated third locker: " + lockerNumbers[2]);
        // modify the first and last lockers
        lockerNumbers[0] = 888;
        lockerNumbers[4] = 777;
        // print updated array
        System.out.println("All updated lockers:");
        System.out.println(lockerNumbers[0]);
        System.out.println(lockerNumbers[1]);
        System.out.println(lockerNumbers[2]);
        System.out.println(lockerNumbers[3]);
        System.out.println(lockerNumbers[4]);
    }
}
