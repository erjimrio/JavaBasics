public class PlayerCounter {
    static int totalPlayers = 0; // static variable
    String name; // instance variable
    public PlayerCounter(String playerName){
        name = playerName;
        totalPlayers++; // increment shared count
    }
    public void displayInfo(){
        System.out.println("Player Name: " + name);
    }
    public static void displayTotal(){
        System.out.println("Total Players: " + totalPlayers);
    }
    public static void main(String[] args){
        PlayerCounter p1 = new PlayerCounter("Alice");
        PlayerCounter p2 = new PlayerCounter("Bob");
        PlayerCounter p3 = new PlayerCounter("Charlie");
        p1.displayInfo();
        p2.displayInfo();
        p3.displayInfo();
        PlayerCounter.displayTotal(); // access static variable through class
    }
}
