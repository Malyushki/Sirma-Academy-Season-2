import java.util.ArrayList;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price; //no return value
    }

    public void display() {   //should not be final
        System.out.println(this.name + " - $ " + this.price);
    }
}

class Fruit extends Product {
    public Fruit(String name, double price) {
        super(name, price);
    }

    @Override
    public void display() {
        System.out.println(getName() + " - $ " + getPrice());  //should get name and price
    }
}

class Vegetable extends Product {
    public Vegetable(String name, double price) {
        super(name, price);
    }
}

class Spice extends Product {
    public Spice(String name, double price) { // type error no boolean in constructor
        super(name, price);
    }
}

public class EX_07_16_03_2023 {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();    // initialisations of arraylist
        products.add(new Fruit("Apple", 0.99));
        products.add(new Fruit("Banana", 0.29));
        products.add(new Vegetable("Carrot", 0.49));
        products.add(new Vegetable("Broccoli", 0.89));
        products.add(new Spice("Cinnamon", 1.99));
        products.add(new Spice("Garlic", 0.79));
        for (Product p : products) {   //just name of list
            p.display();
        }
    }
}
