public class StringFormattingDemo {
    public static void main(String[] args) {
        String studentName ="Liam";
        int studentAge = 20;
        double finalScore = 88.456;
        // format the output
        String report = String.format(
                "Student: %s\nAge: %d\nFinal Score: %.1f\nStatus: %s",
                studentName, studentAge, finalScore, "Passed"
        );
        System.out.println(report);
    }
}
