import java.util.Arrays;
import java.util.Scanner;

public class HW_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];
        int[] numbers2 = new int[n];
        System.out.println("Enter numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < n / 2; i++) {
            numbers2[i] = numbers[i + n / 2];
        }
        for (int i = n / 2; i < n; i++) {
            numbers2[i] = numbers[i - n / 2];
        }

        System.out.println(Arrays.toString(numbers2));
    }
}
