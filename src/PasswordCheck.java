import java.util.Scanner;
public class PasswordCheck {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String password;
        String correctPassword = "java123";
        do{
            System.out.println("Enter password: ");
            password = input.nextLine();
        }
        while (!password.equals(correctPassword));
        System.out.println("Access granted!");
    }
}
