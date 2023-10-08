package EX_02_14_03_2023;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Names:");
        String holderNames = scanner.nextLine();
        System.out.println("ID:");
        String id = scanner.nextLine();
        System.out.println("Currency:");
        String currency = scanner.nextLine();



        BalanceP balanceP = new BalanceP(holderNames, id, currency);
        BalanceS balanceS = new BalanceS(holderNames, id, currency);
        System.out.println("----------------------------------------");
        balanceP.showDetails();
        System.out.println("----------------------------------------");
        balanceS.showDetails();
        System.out.println("----------------------------------------");
        System.out.println("Deposit money in payment account");
        double deposit = Double.parseDouble(scanner.nextLine());
        balanceP.depositMoney(deposit);
        System.out.println("Deposit money in savings account");
        deposit = Double.parseDouble(scanner.nextLine());
        balanceS.depositMoney(deposit);

        System.out.println("Make a transaction from payments account:");
        double pay = Double.parseDouble(scanner.nextLine());

        balanceP.pay(pay);




    }
}
