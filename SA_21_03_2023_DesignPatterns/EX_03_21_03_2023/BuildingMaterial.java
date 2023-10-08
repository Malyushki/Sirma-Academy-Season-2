package EX_03_21_03_2023;

public abstract class BuildingMaterial {
     double price;
     String quality;

    public BuildingMaterial(double price, String quality) {
        this.price = price;
        this.quality = quality;
    }

    abstract void printPrice();

    abstract void printQuality();
}


