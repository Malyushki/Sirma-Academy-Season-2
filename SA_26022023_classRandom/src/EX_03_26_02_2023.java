import java.util.Random;
import java.util.Scanner;

public class EX_03_26_02_2023 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int credit = 10;
        String bet = "y";
        while (credit > 0 && bet.toLowerCase().equals("y")) {
            credit--;
            int num1 = random.nextInt(1, 11);
            int num2 = random.nextInt(1, 11);
            int num3 = random.nextInt(1, 11);
            System.out.printf("Your numbers are N1: %d ,N2: %d,N3: %d%n", num1, num2, num3);
            if (num1 == num2 && num2 == num3) {
                System.out.println("You have 3 matching numbers");
                credit += 10;
            } else if (num1 == num2 || num1 == num3 || num2 == num3) {
                System.out.println("You have 2 matching numbers");
                credit += 5;
            } else {
                System.out.println("No matches");
            }
            System.out.println("New credit:" + credit);
            System.out.print("Do you want to bet again? Type [y] to continue:");
            bet = scanner.nextLine();

        }
        System.out.printf("You leave our casino with %d credits.%n", credit);

    }
}