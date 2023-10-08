import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EX_05_25_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text");
        String text = scanner.nextLine();

        String vowelsRegex = "(?i)[aeiou]";
        String consonantsRegex = "(?i)[bcdfghjklmnpqrstvwxyz]";

        Pattern vowelsPattern = Pattern.compile(vowelsRegex);
        Matcher vowelsMatcher = vowelsPattern.matcher(text);

        Pattern consonantsPattern = Pattern.compile(consonantsRegex);
        Matcher consonantsMatcher = consonantsPattern.matcher(text);

        int vowels = 0;
        int consonants = 0;

        while (vowelsMatcher.find()) {
            vowels++;
        }

        while (consonantsMatcher.find()) {
            consonants++;
        }


        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);

    }
}



