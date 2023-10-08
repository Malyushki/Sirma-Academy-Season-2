import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EX_04_25_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter IP address");
        String ipAddress = scanner.nextLine();

        String regex = "(^0+)|(\\.0+)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(ipAddress);
        if (matcher.find()) {

            System.out.println("There were zeros");
            System.out.println(ipAddress.replaceAll("(^0+)", "").replaceAll("(\\.0+)", "."));

        } else {

            System.out.println("Ip is correct");
        }
    }
}

