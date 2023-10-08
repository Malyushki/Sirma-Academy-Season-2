import java.util.Scanner;

public class EX_02_18_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = scanner.nextLine();
        text = text.replaceAll("s","ab").replaceAll("a","bb").replaceAll("bbb","x");


        System.out.println("Result:");
        System.out.println(text);
    }
}
