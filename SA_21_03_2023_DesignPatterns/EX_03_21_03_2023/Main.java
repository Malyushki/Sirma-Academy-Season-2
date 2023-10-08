package EX_03_21_03_2023;

public class Main {
    public static void main(String[] args) {
        MaterialFactory factory = new MaterialFactory();

        Material material1 = factory.getMaterial("Concrete");
        Material material2 = factory.getMaterial("Wood");
        Material material3 = factory.getMaterial("Granit");

        material1.getPrice();
        material1.getQuality();
        material1.build(500000,"House");


        material2.getPrice();
        material2.getQuality();
        material2.build(20000,"House");

        material3.getPrice();
        material3.getQuality();
        material3.build(1000000,"House");
    }
}
