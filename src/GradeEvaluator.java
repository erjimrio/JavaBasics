public class GradeEvaluator {
    public static void main(String[] args){
        int score = 82;
        if(score >= 90){
            System.out.println("Grade: A");
        }
        else if(score >= 75){
            System.out.println("Grade: B");
        }
        else if(score >= 60){
            System.out.println("Grade: C");
        }
        else if(score >= 40){
            System.out.println("Grade: D");
        }
        else{
            System.out.println("Grade: F");
        }
        System.out.println("Evaluation complete.");
    }
}
