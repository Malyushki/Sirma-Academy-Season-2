import java.text.DecimalFormat;
import java.util.Scanner;

public class HW_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N numbers: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        double[] dividedBy2Numbers = new double[n];
        System.out.println("Enter number array: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            dividedBy2Numbers[i] = numbers[i] * 1.00 / 2;
        }
        for (int i = 0; i < n; i++) {
            DecimalFormat df = new DecimalFormat("#.##");
            String formatted = df.format(dividedBy2Numbers[i]);
            System.out.print(formatted + " ");


        }


    }
}