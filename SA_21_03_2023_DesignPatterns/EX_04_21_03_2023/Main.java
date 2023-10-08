package EX_04_21_03_2023;

public class Main {
    public static void main(String[] args) {

        BurgasPizzaStore burgasPizzaStore = new BurgasPizzaStore();

        Pizza pizza1 = burgasPizzaStore.createPizza("Margarita");
        Pizza pizza2 = burgasPizzaStore.createPizza("Pepperoni");

        burgasPizzaStore.orderPizza(pizza1);

        burgasPizzaStore.orderPizza(pizza2);

    }
}
