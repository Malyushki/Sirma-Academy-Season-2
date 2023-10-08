package EX_02_21_03_2023;

public class Food {
    private double price;

    public Food(double price) {
        this.price = price;
    }

    public void buy(double money, int quantity) {
        double cost = price * quantity;
        if (money >= cost) {
            System.out.printf("Successful purchase! You have bought %d %s for %.2f leva%n", quantity, getClass().getSimpleName(), cost);
        } else {
            System.out.println("Not enough money!");
        }
    }

    public void eat() {
        System.out.printf("You have eaten %s%n", getClass().getSimpleName());
    }

    public void prepare(int quantity) {
        System.out.printf("%d %s are being prepared right now.%n", quantity, getClass().getSimpleName());
    }
}
