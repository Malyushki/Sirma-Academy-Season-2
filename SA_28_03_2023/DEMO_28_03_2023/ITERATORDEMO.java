package DEMO_28_03_2023;
import java.util.Iterator;



class Food {

    private String name;
    private String brand;
    private double price;

    public Food(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public String getBrand() {
        return this.brand;
    }
    public double getPrice() {
        return this.price;
    }

}



class FoodIterator implements Iterator<Food> {

    private Food[] foods;
    private int position;

    public FoodIterator(Food[] foods) {
        this.foods = foods;
        this.position = 0;
    }

    public boolean hasNext() {
        return position < this.foods.length;
    }

    public Food next() {
        if (!hasNext()) {
            throw new RuntimeException("No more elements");
        }
        Food food = foods[position];
        position++;
        return food;
    }
}


public class ITERATORDEMO {
    public static void main(String[] args) {
        // Create an array of persons
        Food[] foods = {
                new Food("bananas","Tropicana", 8),
                new Food("chocolate","Milka", 2),                              new Food("cola","pepsi", 3)
        };

        // Get an iterator for the array
        Iterator<Food> iterator = new FoodIterator(foods);

        // Use the iterator to loop through the array
        while (iterator.hasNext()) {
            Food food = iterator.next();
            System.out.println(food.getName() + " \n Brand: " + food.getBrand() + " \nPrice: "+food.getPrice());
        }
    }
}