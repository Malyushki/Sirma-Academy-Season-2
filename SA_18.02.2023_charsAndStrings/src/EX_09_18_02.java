import java.util.Arrays;
import java.util.Scanner;

public class EX_09_18_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter words:");
        String[] text = scanner.nextLine().split("\\s+");
        String[] result = new String[text.length];
        for (int i = 0; i < text.length; i++) {
            result[i] = text[i].replaceAll("a","@");
        }


        System.out.println("Result:");
        System.out.println(Arrays.toString(result).replaceAll("[\\[\\]]",""));

      //  System.out.println(Arrays.toString(text).replaceAll("a","@").replaceAll("[\\[\\]]",""));
    }
}
