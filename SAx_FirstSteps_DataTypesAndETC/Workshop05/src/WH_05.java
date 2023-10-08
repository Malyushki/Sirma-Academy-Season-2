import java.util.Scanner;

public class WH_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int a = 0;
        for (int i = 0; i < input.length(); i++) {
             a += Integer.parseInt(String.valueOf(input.charAt(i)));

        }

       System.out.printf("Sum of digits of the number: %s is %d ",input,a);

    }
}
