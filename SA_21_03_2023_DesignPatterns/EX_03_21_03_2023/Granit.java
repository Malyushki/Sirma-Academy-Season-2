package EX_03_21_03_2023;

public class Granit extends BuildingMaterial implements Material {

    public Granit() {
        super(1000, "Best");
    }

    @Override
    void printPrice() {
        System.out.println("Price is: " + this.price);
    }

    @Override
    void printQuality() {
        System.out.println("Quality is" + this.quality);
    }

    @Override
    public void build(double amount, String building) {
        System.out.printf("Building a %s for %.2f%n", building, amount);
    }

    @Override
    public void getQuality() {
        printQuality();
    }

    @Override
    public void getPrice() {
        printPrice();
    }
}
