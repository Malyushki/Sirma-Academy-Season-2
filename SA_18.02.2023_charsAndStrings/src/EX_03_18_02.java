import java.util.Scanner;

public class EX_03_18_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = scanner.nextLine();

        int indexOfs = text.lastIndexOf("s");
        text = text.substring(0,indexOfs+1);


        System.out.println("Result:");
        System.out.println(text);
    }
}
