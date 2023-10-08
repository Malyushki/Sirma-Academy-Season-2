import java.util.Arrays;
import java.util.Scanner;

public class WH_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbs1 = new int[10];
        int[] numbs2 = new int[10];
        for (int i = 0; i < 10; i++) {
            numbs1[i] = scanner.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            numbs2[i] = scanner.nextInt();
        }
        int[] combined = new int[20];

        for (int i = 0; i < 20; i+=2) {
            combined[i] = numbs1[i/2];
            combined[i+1] = numbs2[i/2];

        }

        System.out.println(Arrays.toString(combined).replaceAll("[\\[\\],]", ""));
    }
}
