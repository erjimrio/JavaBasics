public class LoginCheck {
    public static void main(String[] args){
        String username = "admin";
        String password = "1234";
        if(username.equals("admin")){
            System.out.println("Username is correct.");
            if(password.equals("1234")){
                System.out.println("Login successful. Welcome!");
            }
            else{
                System.out.println("Incorrect password.");
            }
        }
        else{
            System.out.println("Username not found.");
        }
        System.out.println("Login process complete.");
    }
}
