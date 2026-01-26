public class ScoreKeeper {
    public static void main(String[] args){
        int score = 2500; // starting score
        System.out.println("Starting score: " + score);
        // player earns points
        score = score + 500;
        System.out.println("Score after bonus: " + score);
        // player loses some points
        score = score - 300;
        System.out.println("Score after penalty: " + score);
    }
}
