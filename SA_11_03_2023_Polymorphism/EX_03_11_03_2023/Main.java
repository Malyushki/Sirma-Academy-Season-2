package EX_03_11_03_2023;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter balance");
        double balance = Double.parseDouble(scanner.nextLine());
        int months = 0;
        try {
            System.out.println("Enter months. Or nothing");
            months = Integer.parseInt(scanner.nextLine());


        } catch (Exception e) {

        }


        if (months != 0) {
            System.out.printf("For %d month%n",months);
            InterestCalculator.compound(balance, months);

        } else {
            System.out.println("For 1 month");
            InterestCalculator.compound(balance);
        }
    }
}