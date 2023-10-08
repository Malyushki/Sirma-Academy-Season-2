package EX_04_21_03_2023;

public class Pizza {
    private String pizzaName;
    private String dough;
    private String sauce;

    public Pizza(String pizzaName, String dough, String sauce) {
        this.pizzaName = pizzaName;
        this.dough = dough;
        this.sauce = sauce;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }
    public void bake(){
        System.out.println("Pizza is in the oven");
    }

    public void box(){
        System.out.println("Pizza is in the BOX");
    }

    public void cut(){
        System.out.println("Cutting pizza...");
    }

    public void getName(){
        System.out.println(this.pizzaName);
    }


}
