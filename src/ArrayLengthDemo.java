public class ArrayLengthDemo {
    public static void main(String[] args) {
        int[] lockerNumbers = {101,102,103,104,105};
        // using length property
        System.out.println("Total lockers: " + lockerNumbers.length);
        // looping through array using length
        for(int i=0; i< lockerNumbers.length;i++){
            System.out.println("Locker " + i + ": " + lockerNumbers[i]);
        }
    }
}
