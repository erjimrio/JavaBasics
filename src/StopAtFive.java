public class StopAtFive {
    public static void main(String[] args){
        int number = 1;
        while(number <= 10){
            if(number == 5){
                System.out.println("Number 5 reached! Exiting loop...");
                break; // break stops the loop here
            }
            System.out.println("Number: " + number);
            number++;
        }
        System.out.println("Loop finished.");
    }
}
