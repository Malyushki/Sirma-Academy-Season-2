import java.util.Scanner;

public class EX_10_18_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter words:");
        String[] text = scanner.nextLine().split("\\s+");

        System.out.println("Result:");
        for (String e : text) {
            if (e.length() >= 3) {
                System.out.println(e.charAt(2));
            } else {
                //  System.out.println(e.charAt(e.length()-1));
                System.out.println("Word is less than 3 symbols");
            }
        }
    }
}
