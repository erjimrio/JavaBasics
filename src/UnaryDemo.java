public class UnaryDemo {
    public static void main(String[] args){
        int counter =5;
        boolean isActive = true;
        System.out.println("Initial Counter: " + counter);
        System.out.println("Initial State: " + isActive);
        counter++; // increase by 1
        System.out.println("After counter++: " + counter);
        ++counter; // increase by 1 (prefix)
        System.out.println("After ++counter: " + counter);
        counter--; // decrease by 1
        System.out.println("After counter--: " + counter);
        --counter; // decrease by 1 (prefix)
        System.out.println("After --counter: " + counter);
        int negative = -counter; // unary minus
        System.out.println("Negative value: " + negative);
        isActive = !isActive; // toggle boolean
        System.out.println("After !isActive: " + isActive);
    }
}
