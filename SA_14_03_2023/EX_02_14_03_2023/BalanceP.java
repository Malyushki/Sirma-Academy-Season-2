package EX_02_14_03_2023;

public class BalanceP extends PaymentAccount {
    double amount;

    public BalanceP(String holderNames, String id, String currency) {
        super(holderNames, id, currency, true);
        this.amount = 0;
    }

    public void depositMoney(double amount) {
        if (amount > 0) {
            this.amount += amount;
            System.out.println("New balance:" + this.amount);
        } else {
            System.out.println("You can't deposit negative or 0 currency");
        }
    }

    public void pay(double amount) {
        if (amount > 0) {
            if (this.amount > amount) {
                this.amount -= amount;
                System.out.println("You have successfully paid " + amount);
                System.out.println("New balance: " + this.amount);
            } else {
                System.out.println("Insufficient balance. You should deposit money");

            }

        } else {
            System.out.println("Invalid amount");
        }


    }


}
