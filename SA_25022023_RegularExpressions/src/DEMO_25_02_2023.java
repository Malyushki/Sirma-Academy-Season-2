
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DEMO_25_02_2023 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("world", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Hello, world!");
        boolean matchFound = matcher.find();

        if (matchFound) {
            System.out.println("1 Match found");
        } else {
            System.out.println("1 Match not found");
        }

        pattern = Pattern.compile("[hyx]", Pattern.CASE_INSENSITIVE);
        matcher = pattern.matcher("hyx");
        matchFound = matcher.find();

        if (matchFound) {
            System.out.println("2 Match found");
        } else {
            System.out.println("2 Match not found");
        }

        pattern = Pattern.compile("[1-4]");
        matcher = pattern.matcher("56");
        matchFound = matcher.find();


        if (matchFound) {
            System.out.println("3 Match found");
        } else {
            System.out.println("3 Match not found");
        }


        pattern = Pattern.compile("^he", Pattern.CASE_INSENSITIVE);
        matcher = pattern.matcher("hello, world");
        matchFound = matcher.find();


        if (matchFound) {
            System.out.println("4 Match found");
        } else {
            System.out.println("4 Match not found");
        }


        pattern = Pattern.compile("1{3}");
        matcher = pattern.matcher("1156");
        matchFound = matcher.find();


        if (matchFound) {
            System.out.println("5 Match found");
        } else {
            System.out.println("5 Match not found");
        }


        pattern = Pattern.compile("[0-3]|[7-9]");
        matcher = pattern.matcher("2d1");
        matchFound = matcher.find();


        if (matchFound) {
            System.out.println("6 Match found");
        } else {
            System.out.println("6 Match not found");
        }


        String str = "This is the 1/2 of a sentence";


        pattern = Pattern.compile("\\d+");

        String[] split = pattern.split(str);

        for (String s : split) {
            System.out.println(s);
        }

        String replaced = str.replaceAll("\\d+", "N");
        System.out.println(replaced);


    }
}


