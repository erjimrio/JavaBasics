public class RoundScoreCalculator {
    public void playRound(){
        int roundScore = 100; // local variable
        roundScore +=50; // add bonus
        System.out.println("Round Score: " + roundScore);
    }
    public static void main(String[] args){
        RoundScoreCalculator game = new RoundScoreCalculator();
        game.playRound();
        // Uncommenting the next line will cause an error
        // Syste.out.println("roundScore); // roundScore is not visible here
    }
}
