public class SpeedMonitor {
    public static void main(String[] args) {
        short speed = 120; // current speed in km/h
        System.out.println("Current speed: " + speed);
        // vehicle speeds up
        speed = 130;
        System.out.println("Increased speed: " + speed);
        // vehicle slows down
        speed = 90;
        System.out.println("Reduced speed: " + speed);
    }
}
