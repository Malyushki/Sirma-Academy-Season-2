package EX_01_21_03_2023;

public class DrinkFactory {
    public Drink getDrink(String n, double price) {

        switch (n.toLowerCase()) {
            case "softdrink":
                return new SoftDrink(price);

            case "caffeinedrink":
                return new CaffeineDrink(price);

            case "alcoholicdrink":
                return new AlcoholicDrink(price);

            default:
                return null;
        }

    }
}
