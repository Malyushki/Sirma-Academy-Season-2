package EX_02_14_03_2023;

public class SavingAccount extends Account {
    final double minSum = 10;
    final double tax = 2.5;
    boolean status ;

    public SavingAccount(String holderNames, String id, String currency, boolean status) {
        super(holderNames, id, currency, "SavingAccount");
        this.status = status;

    }

    @Override
    public void showDetails() {
        System.out.println("Welcome");
        System.out.println("Names: " + this.holderNames);
        System.out.println("ID: " + this.id);
        System.out.println("Currency: " + this.currency);
        System.out.println("Account: " + this.typeAccount);
        System.out.println("Account Status: " + this.status);
        System.out.println("Account minimum sum: " + this.minSum);
        System.out.println("Account tax: " + this.tax);

    }
}
