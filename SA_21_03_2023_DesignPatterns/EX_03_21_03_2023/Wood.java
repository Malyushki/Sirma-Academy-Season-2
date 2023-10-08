package EX_03_21_03_2023;

public class Wood extends BuildingMaterial implements Material {

    public Wood() {
        super(200, "Por");
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
