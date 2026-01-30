public class PassOrFail {
    public static void main(String[] args){
        int score = 75;
        int passingMark = 50;
        String result = (score >= passingMark) ? "Pass" : "Fail";
        System.out.println("Score: " + score);
        System.out.println("Result: " + result);
    }
}
