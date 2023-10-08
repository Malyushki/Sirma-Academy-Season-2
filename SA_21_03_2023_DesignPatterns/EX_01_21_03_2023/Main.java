package EX_01_21_03_2023;

public class Main {
    public static void main(String[] args) {
        DrinkFactory factory = new DrinkFactory();

        Drink drink1 = factory.getDrink("AlcoholicDrink", 10);
        Drink drink2 = factory.getDrink("CaffeineDrink", 2);
        Drink drink3 = factory.getDrink("SoftDrink", 4);

        drink1.buy(25,2);
        drink1.drink();

        drink2.buy(5,2);
        drink2.drink();

        drink3.buy(1,2);
        drink3.drink();

    }
}
