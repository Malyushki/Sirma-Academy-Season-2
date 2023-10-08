import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EX_01_25_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password");
        String passwordInput = scanner.nextLine();

        String regex = "(?=.*\\d)(?=.*\\w)(?=.*[!@#&()–\\[{}\\]:;',?\\/*~$^+=<>]).{8,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordInput);
        if (matcher.find()) {
            System.out.println("Password accepted!");
        } else {
            System.out.println("Invalid password");
        }
    }
}

