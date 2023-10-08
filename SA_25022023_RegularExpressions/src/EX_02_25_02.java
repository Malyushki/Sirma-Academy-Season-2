import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EX_02_25_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text");
        String userInput = scanner.nextLine();

        String regex = "([\\w\\s+]+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(userInput);
        if (matcher.find()) {
            System.out.println("Text is OK");
        } else {

            System.out.println("Error text contains numbers or unacceptable symbols");
        }
    }
}

