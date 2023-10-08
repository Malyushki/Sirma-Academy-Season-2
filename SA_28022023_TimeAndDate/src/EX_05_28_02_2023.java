import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class EX_05_28_02_2023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pizzas:");
        int pizzaAmount = Integer.parseInt(scanner.nextLine());
        double pizzaPrice = 14.30;
        System.out.println("How many Coca-Colas:");
        int colaAmount = Integer.parseInt(scanner.nextLine());
        double colaPrice = 2.5;
        LocalTime deliveryTime = LocalTime.now().plusHours(2);
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        double total = pizzaAmount * pizzaPrice + colaAmount * colaPrice;
        System.out.println("DELIVERY");
        System.out.println("--------------------------------------");
        System.out.printf("PRICE: %.2f%n", total);
        System.out.println("You will receive your order at: " + deliveryTime.format(timeFormatter));
        System.out.println("--------------------------------------");
        System.out.println("Thank you!");
    }
}