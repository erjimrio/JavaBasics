public class ScopeTester {
    int gameLevel = 1; // instance variable
    public void startGame(){
        int score = 0; // local variable
        System.out.println("Game Level: " + gameLevel);
        System.out.println("Score at start: " + score);
        if (gameLevel==1){
            int bonus = 100; // block variable
            System.out.println("Bonus inside if block: " + bonus);
        }
        // Uncommenting the next line will cause an error because bonus is out of scope
        //System.out.println(bonus);
    }
    public static void main(String[] args){
        ScopeTester tester = new ScopeTester();
        tester.startGame();
        // Uncommenting the next line will cause an error because score is out of scope
        //System.out.println(score);
    }
}
