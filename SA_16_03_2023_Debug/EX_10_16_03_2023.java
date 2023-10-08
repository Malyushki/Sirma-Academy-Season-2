import java.util.Scanner;

class Smartphone {

    public String brand;
    public String model;
    public double price;

    Smartphone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        //return 0;   //no return statement in constructor
    }

    public void display() {   //public
        System.out.println(brand + " " + model + " - $" + price);
    }
}

class Samsung extends Smartphone {
    Samsung(String model, double price) {
        super("Samsung", model, price);
        //System.exit(0);   // no need to exit program
    }
}

class Apple extends Smartphone {
    Apple(String model, double price) {
        super("Apple", model, price);
    }
}

class Google extends Smartphone {
    Google(String model, double price) {
        super("Google", model, price);
    }
}

public class EX_10_16_03_2023 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  //import scanner add System.in
        System.out.println("Enter samsung phone");
        Samsung samsung1 = new Samsung(s.next(), s.nextDouble());  //missing new keyword
        System.out.println("Enter apple phone");

        Apple apple1 = new Apple(s.next(), s.nextDouble());

        System.out.println("Enter google phone");

        Google google1 = new Google(s.next(), s.nextDouble());


        System.out.println("Welcome to our smartphone store!");
        System.out.println("Here's our catalogue:");  //not menu should be catalogue;

        System.out.println("\nSamsung:");
        samsung1.display();  //remove argument


        System.out.println("\nApple:");
        apple1.display();  //apple1-->Apple


        System.out.println("\nGoogle:");
        google1.display();

    }
}
