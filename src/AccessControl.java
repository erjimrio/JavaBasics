public class AccessControl {
    public static void main(String[] args){
        int age = 20;
        boolean hasTicket = true;
        boolean isVIP = false;
        boolean canEnter = (age >=18)&&(hasTicket||isVIP);
        boolean notAllowed = !canEnter;
        System.out.println("Age: " + age);
        System.out.println("Has Ticket: " + hasTicket);
        System.out.println("Is VIP: " + isVIP);
        System.out.println("Can Enter: " + canEnter);
        System.out.println("Not Allowed: " + notAllowed);
    }
}
