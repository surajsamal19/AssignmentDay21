import java.util.Scanner;
import java.util.regex.Pattern;

public class FirstName {
    Scanner sc = new Scanner(System.in);

    public void CheckFirstName() {
        System.out.println("Enter the first Name");
        String firstname = sc.nextLine();
        if (Pattern.matches("^(A-Z){1}(a-z){2}$", firstname)) {
            System.out.println("Firstname is valid");
        } else {
            System.out.println("First Name is invalid");
        }

    }

    public static void main(String[] args) {
        FirstName match = new FirstName();
        match.CheckFirstName();

    }
}
