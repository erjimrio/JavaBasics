public class LevelTracker {
    public static void main(String[] args){
        byte level = 5; // current game level
        System.out.println("Current level: " + level);
        // player moves to next level
        level = 6;
        System.out.println("New level: " + level);
        // level increases again
        level = 7;
        System.out.println("Final level: " + level);
    }
}
