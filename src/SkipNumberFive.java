public class SkipNumberFive {
    public static void main(String[] args){
        for(int i = 1; i <= 10; i++){
            if(i == 5){
                continue; // skip printing when i is 5
            }
            System.out.println("Number: " + i);
        }
        System.out.println("Loop complete!");
    }
}
