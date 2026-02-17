public class ArrayIterationDemo {
    public static void main(String[] args) {
        int[] lockerNumbers = {101, 102,103, 104, 105};
        // using regular for loop
        System.out.println("Using regular for loop:");
        for (int i = 0; i < lockerNumbers.length; i++){
            System.out.println("Locker " + i +": " + lockerNumbers[i]);
        }
        // using enhanced for loop
        System.out.println("Using enhanced for loop:");
        for (int lockker : lockerNumbers){
            System.out.println("Locker Number: " + lockker);
        }
    }
}
