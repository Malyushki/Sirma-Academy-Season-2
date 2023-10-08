package EX_04_21_03_2023;


public class BurgasPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        switch (type.toLowerCase()) {
            case "margarita":
                return new Margarita();

            case "pepperoni":
                return new Pepperoni();

            default:
                return null;
        }
    }
}
