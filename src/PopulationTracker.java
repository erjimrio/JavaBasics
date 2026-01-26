public class PopulationTracker {
    public static void main(String[] args){
        long population = 8000000000L; // starting population
        System.out.println("Starting population: " + population);
        // population increases
        population = population + 50000000L;
        System.out.println("Population after growth: " + population);
        // population decreases
        population = population - 10000000L;
        System.out.println("Population after decline: " + population);
    }
}
