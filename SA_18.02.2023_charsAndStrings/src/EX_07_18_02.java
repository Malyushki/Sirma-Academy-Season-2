import java.util.Arrays;
import java.util.Scanner;

public class EX_07_18_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String[] text = scanner.nextLine().split("\\s+");

        int maxLength = Arrays.stream(text).mapToInt(String::length).max().orElse(0);
      /*
        int maxLength = -1;
        for (String e:text) {
            if (e.length()>maxLength){
                maxLength = e.length();
            }
        }
              */

        System.out.println("Result:");
        System.out.println(maxLength);

    }
}
