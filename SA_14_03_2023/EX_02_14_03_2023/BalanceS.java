package EX_02_14_03_2023;

public class BalanceS extends SavingAccount {
    double amount;

    public BalanceS(String holderNames, String id, String currency) {
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


}
