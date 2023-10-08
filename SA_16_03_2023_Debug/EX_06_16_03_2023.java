import java.util.ArrayList;

class Drink {

    private String name;
    private String type;
    private double price;
    public Drink(String name, String type, double price) {  //constructor should be public
        this.name = name;
        this.type = type;
        this.price = price;
    }
    public String getName() {  //should be public getter
        return name;
    }
    public String getType() {   //should be public / no static
        return type;
    }

    double getPrice() {
        return price;
    }
}

class SoftDrink extends Drink {

    SoftDrink(String name, double price) {
        super(name, "Soft Drink", price);
    }
}

class Cocktail extends Drink {
    public boolean hasAlcohol;
    Cocktail(String name, double price, boolean hasAlcohol) {  //spelling error
        super(name, "Cocktail", price);
        this.hasAlcohol=hasAlcohol;
    }
}

class Spirit extends Drink {
    Spirit(String name, double price) {
        super(name, "Spirit", price);
    }
}

class SpiritCocktail extends Cocktail{
    SpiritCocktail(String name, double price) {
        super(name, price, true);
    }
}
public class EX_06_16_03_2023 {
    public static void main(String[] args) {
        ArrayList<Drink> drinks = new ArrayList<Drink>();  //no imported class
        drinks.add(new SoftDrink("Coca-Cola", 2.5));
        drinks.add(new SoftDrink("Sprite", 2));
        drinks.add(new Cocktail("Virgin Margarita", 8, false));
        drinks.add(new Cocktail("Cosmopolitan", 10, true));
        drinks.add(new Spirit("Vodka", 6));
        drinks.add(new Spirit("Whiskey", 8));
        drinks.add(new SoftDrink("Fanta", 2));
        drinks.add(new Cocktail("Long Island Iced Tea", 12, false));
        drinks.add(new SoftDrink("Ginger Ale", 2.5));
        drinks.add(new Spirit("Gin", 7));
        drinks.add(new SpiritCocktail("Gin", 7));

        System.out.println("Drinks:");
        for (Drink drink : drinks) {   //should be Drink class
            System.out.println(drink.getName() + " - " + drink.getType() + " - " + drink.getPrice());
        }
    }
}