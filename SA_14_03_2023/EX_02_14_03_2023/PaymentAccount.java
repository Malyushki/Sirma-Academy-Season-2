package EX_02_14_03_2023;

public class PaymentAccount extends Account {
    final double minSum = 5;
    final double tax = 1.5;
    boolean status;

    public PaymentAccount(String holderNames, String id, String currency, boolean status) {
        super(holderNames, id, currency, "PaymentAccount");
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
