import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EX_08_25_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email address");
        String mail = scanner.nextLine();

        String regex = "^[A-Za-z]+[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mail);
        if (matcher.find()) {

            System.out.println("Valid email address.");

        } else {

            System.out.println("Invalid email address.");
        }
    }
}

