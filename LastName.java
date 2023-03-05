import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastName {
    Scanner sc = new Scanner(System.in);

    public void ChecklastName() {
        System.out.println("Enter the last Name");
        String lastName = sc.nextLine();
        Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]{2}");
        Matcher matcher = pattern.matcher(lastName);
        boolean matchFound = matcher.find();
        if(matchFound){
            System.out.println("Last name is valid");
        } else {
            System.out.println("Last name is invalid");
        }
    }

    public static void main(String[] args) {
        LastName match = new LastName();
        match.ChecklastName();
    }
}
