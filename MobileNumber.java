import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumber {
        Scanner sc = new Scanner(System.in);
        public void checkmobilenumber(){
            System.out.println("Enter your mobile number");
            String mobilenumber = sc.nextLine();
            Pattern pattern = Pattern.compile("^[+][0-9]{2}+[ ]?[0-9]{10}$");
            Matcher matcher = pattern.matcher(mobilenumber);
            boolean matchfound = matcher.find() ;
            if (matchfound) {
                System.out.println("mobile number is valid");
            }
            else
            {
                System.out.println("Mobile number is invalid.Enter again");
                checkmobilenumber();
            }


    }
    public static void main(String[] args) {
            MobileNumber check = new MobileNumber();
            check.checkmobilenumber();

    }
}
