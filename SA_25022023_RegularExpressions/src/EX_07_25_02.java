import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EX_07_25_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        String number = scanner.nextLine();

        String regex = "[^0-1]";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);
        if (matcher.find()) {

            System.out.println("The number is not binary");

        } else {

            System.out.println("Number is binary");
        }
    }
}

