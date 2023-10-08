package EX_02_21_03_2023;

public class FoodFactory {

    public Food getFood(String n, double price) {
        switch (n.toLowerCase()) {
            case "dairy":
                return new Dairy(price);

            case "salami":
                return new Salami(price);

            case "vegetable":
                return new Vegetable(price);

            default:
                return null;
        }
    }
}
