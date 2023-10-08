import java.util.Scanner;

class Reseat {
    String date;
    double amount;
    double tax;


}

public class EX07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER DATE:");
        String date = scanner.nextLine();
        System.out.println("ENTER AMOUNT:");
        double amount= Double.parseDouble(scanner.nextLine());
        System.out.println("ENTER TAX:");
        double tax= Double.parseDouble(scanner.nextLine());

        if (amount>0){
            if (tax>=0 ){
               Reseat reseat = new Reseat();
               reseat.amount = amount;
               reseat.date = date;
               reseat.tax = tax;
                System.out.printf("On %s you have received an invoice%n",reseat.date);
                System.out.println("INVOICE:");
                System.out.println("------------");
                System.out.printf("AMOUNT: %.2f%n",reseat.amount);
                System.out.printf("TAX: %.2f (%.2f%%)%n",(reseat.tax/100*reseat.amount),reseat.tax);
                System.out.printf("TOTAL: %.2f%n",(reseat.tax/100*reseat.amount)+reseat.amount);
                System.out.println("------------");
            }
        }
    }
}
