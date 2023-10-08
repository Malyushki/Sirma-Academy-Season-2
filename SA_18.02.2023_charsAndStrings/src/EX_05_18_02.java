import java.util.Scanner;

public class EX_05_18_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String[] text = scanner.nextLine().split("\\s+");

        System.out.println("Result:");
        System.out.println(text.length+" words in this sentence");

    }
}
