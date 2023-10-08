import java.util.ArrayList;

class Car {
    private String brand;
    private String model;
    private double price;

    public Car(String brand, String model,double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}

class Toyota extends Car {
    public Toyota(String model, double price) {
        super("Toyota",model,price);
    }
}

class Honda extends Car {
    public Honda(String model, double price) {
        super("Honda", model, price);
    }
}
class Ford extends Car {
    public Ford(String model, double price) {
        super("Ford", model, price);
    }
}

public class EX_02_16_03_2023 {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Toyota("Camry", 24000));
        cars.add(new Toyota("Corolla", 20000));
        cars.add(new Toyota("Prius", 28000));
        cars.add(new Honda("Civic", 22000));
        cars.add(new Honda("Accord", 26000));
        cars.add(new Ford("Mustang", 34000));
        cars.add(new Ford("Fusion", 24000));

        for (Car c : cars) {
            System.out.println(c.getBrand() + " " + c.getModel() + " - $" + c.getPrice());
        }
    }
}