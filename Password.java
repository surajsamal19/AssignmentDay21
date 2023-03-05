import java.util.Scanner;
import java.util.regex.Pattern;

public class Password {
    public void checkpassword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password");
        String password = sc.nextLine();
        if(Pattern.matches("^[a-z](?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$",password)) {
            System.out.println("Password is valid");
        }
        else{
            System.out.println("Password is invalid.Enter again");
        }


    }
    public static void main(String[] args) {
        Password check = new Password();
        check.checkpassword();

    }
}
