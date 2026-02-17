public class ArrayInitializationDemo {
    public static void main(String[] args) {
        // Initializing using new keyword
        int[] lockerNumbers = new int[3];
        lockerNumbers[0] = 101;
        lockerNumbers[1] = 102;
        lockerNumbers[2] = 103;
        // initializing using array literal
        String[] studentNames = {"Emma", "Noah", "Olivia"};
        // printing values
        System.out.println("Locker Numbers:");
        System.out.println(lockerNumbers[0]);
        System.out.println(lockerNumbers[1]);
        System.out.println(lockerNumbers[2]);
        System.out.println("Student Names:");
        System.out.println(studentNames[0]);
        System.out.println(studentNames[1]);
        System.out.println(studentNames[2]);
    }
}
