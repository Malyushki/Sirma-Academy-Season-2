package EX_04_21_03_2023;

public abstract class PizzaStore {

    abstract Pizza createPizza(String type);

    public void orderPizza(Pizza pizza){

        System.out.println(pizza.getPizzaName());
        pizza.bake();
        pizza.cut();
        pizza.box();

    }

}
