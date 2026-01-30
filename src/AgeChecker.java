public class AgeChecker {
    public static void main(String[] args){
        int age = 20;
        int requiredAge = 18;
        boolean isEqual = age == requiredAge;
        boolean isOlder = age > requiredAge;
        boolean isYounger = age < requiredAge;
        boolean isOldEnough = age >= requiredAge;
        System.out.println("Age: " + age);
        System.out.println("Equal to required age: " + isEqual);
        System.out.println("Older than required age: " + isOlder);
        System.out.println("Younger than required age: " + isYounger);
        System.out.println("Old enough to vote: " + isOldEnough);
    }
}
