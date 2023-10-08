package EX_02_14_03_2023;

public class Account {
    String holderNames;
    String id;
    String currency;
    String typeAccount;

    public Account(String holderNames, String id, String currency, String typeAccount) {
        this.holderNames = holderNames;
        this.id = id;
        this.currency = currency;
        this.typeAccount = typeAccount;
    }
    public void showDetails(){

        System.out.println("Names: "+this.holderNames);
        System.out.println("ID: "+this.id);
        System.out.println("Currency: "+this.currency);
        System.out.println("Account: "+this.typeAccount);
    }
}
