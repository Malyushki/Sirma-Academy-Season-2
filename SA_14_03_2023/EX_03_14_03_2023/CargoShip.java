package EX_03_14_03_2023;

public class CargoShip extends Ship {
    String companyName;
    double volume;
    String shipName;

    public CargoShip(String companyName, double volume, String shipName) {
        super("Cargo Ship");
        this.companyName = companyName;
        this.volume = volume;
        this.shipName = shipName;
    }

    public void show() {
        System.out.println("Type: " +this.getClass().getSimpleName());
        System.out.println("Company: " + this.companyName);
        System.out.println("Ship name: " + this.shipName);
        System.out.println("Volume: " + this.volume);
    }
}
