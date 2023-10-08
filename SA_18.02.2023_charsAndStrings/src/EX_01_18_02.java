import java.util.Scanner;

public class EX_01_18_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = scanner.nextLine();
        StringBuilder sbToPrint = new StringBuilder();

        if (text.length() % 2 == 0) {
            for (int i = 0; i < text.length(); i += 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(text.substring(i, i + 2));
                sb.reverse();
                sbToPrint.append(sb);
            }

        }else {
            for (int i = 0; i < text.length()-1; i += 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(text.substring(i, i + 2));
                sb.reverse();
                sbToPrint.append(sb);
            }
            sbToPrint.append(text.charAt(text.length()-1));
        }
        System.out.println("Result:");
        System.out.println(sbToPrint.toString());
    }
}
