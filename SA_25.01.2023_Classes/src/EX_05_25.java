import java.util.Scanner;
class Order{


    public static void calcPrice(double pizza_price,int pizza_amount,double drink_price, int drinks_amount){
        double delivery = 2.5;
        if (pizza_price<=0 ||pizza_amount<0||drink_price<=0||drinks_amount<0 ){
            System.out.println("Invalid order");
        }else {
            double total = pizza_price*pizza_amount+drink_price*drinks_amount+delivery;
            System.out.println("Total price: "+total);
        }


    }
}
public class EX_05_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pizza price:");
        double pizza_price = Double.parseDouble(scanner.nextLine());
        System.out.print("Pizza quantity:");
        int pizza_amount = Integer.parseInt(scanner.nextLine());
        System.out.print("Drinks price:");
        double drink_price = Double.parseDouble(scanner.nextLine());
        System.out.print("Drinks quantity:");
        int drinks_amount= Integer.parseInt(scanner.nextLine());
        Order.calcPrice(pizza_price,pizza_amount,drink_price,drinks_amount);

    }
}
