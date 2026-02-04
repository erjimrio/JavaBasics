public class CountDownTimer {
    public static void main(String[] args){
        int number = 5; // starting number
        while(number > 0) // loop runs while number is greater than 0
        {
            System.out.println("Countdown: " + number);
            number--; // decrease number by 1 each time
        }
        System.out.println("Blast off!");
    }
}
