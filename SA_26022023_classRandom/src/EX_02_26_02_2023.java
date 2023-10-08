import java.util.Random;
import java.util.Scanner;

public class EX_02_26_02_2023 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String[] coin = {"Heads", "Tails"};
        System.out.println("How many tosses?");
        int n = Integer.parseInt(scanner.nextLine());
        int countHeads = 0;
        int countTails = 0;

        for (int i = 0; i < n; i++) {
            int toss = random.nextInt(2);
            System.out.print("Coin is: ");
            System.out.println(coin[toss]);
            if (toss == 0) {
                countHeads++;
            } else {
                countTails++;
            }

        }
        System.out.printf("%.2f%% Heads and %.2f%% Tails", countHeads * 100.0 / n, countTails * 100.0 / n);
    }
}