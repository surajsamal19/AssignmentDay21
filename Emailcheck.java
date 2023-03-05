import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emailcheck {
    Scanner sc = new Scanner(System.in);

    public void checkemail() {
        System.out.println("Enter your email");
        String email = sc.nextLine();
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+([.][0-9a-zA-Z]+)*@[a-zA-Z]+.[a-z]{2,3}([.][a-z]{2,3})*$");
        Matcher matcher = pattern.matcher(email);
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Email is valid:");
        } else {
            System.out.println("Email is invalid:");
            checkemail();
        }
    }

    public static void main(String[] args) {
        Emailcheck check = new Emailcheck();
        check.checkemail();
    }
}
