package EX_01_21_03_2023;

public class AlcoholicDrink implements Drink{
    private double price;

    public AlcoholicDrink(double price) {
        this.price = price;
    }

    @Override
    public void buy(double money, int quantity) {
        double cost = price * quantity;
        if (money>=cost){
            System.out.println("Successful purchase!");
        }else {
            System.out.println("Not enough money!");
        }
    }

    @Override
    public void drink() {
        System.out.println("You are drinking an alcoholic drink!");
    }
}
