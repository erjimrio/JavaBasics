public class ScoreUpdater {
    public static void main(String[] args){
        int score = 50; // starting sore
        System.out.println("Starting Score: " + score);
        score += 20; // add bonus points
        System.out.println("After bonus: " + score);
        score -=10; // subtract penalty
        System.out.println("After penalty: " + score);
        score *=2; // double the score
        System.out.println("After double: " + score);
        score /=4; // divide the score
        System.out.println("After division: " + score);
        score %=3; // remainder
        System.out.println("After remainder: " + score);
    }
}
