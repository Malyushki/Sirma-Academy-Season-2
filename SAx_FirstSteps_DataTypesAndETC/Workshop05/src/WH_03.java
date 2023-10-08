import java.util.Scanner;

public class WH_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double maxValue = -Double.MAX_VALUE;
        double minValue = Double.MAX_VALUE;

        while (!input.equals("q")) {
            double number = Double.parseDouble(input);
            if (number > maxValue) {
                maxValue = number;
            }
            if (number < minValue) {
                minValue = number;
            }
            input = scanner.nextLine();
        }
        System.out.println("Biggest number: " + maxValue);
        System.out.println("Smallest number: " + minValue);
    }
}
