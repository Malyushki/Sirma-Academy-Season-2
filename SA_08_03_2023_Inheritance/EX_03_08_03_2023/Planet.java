package EX_03_08_03_2023;

public class Planet {
    private double diameter;
    private double mass;
    private String type;
    private int position;

    public Planet(double diameter, double mass, String type, int position) {
        this.diameter = diameter;
        this.mass = mass;
        this.type = type;
        this.position = position;
    }

    public void printInfo() {
        System.out.println("Name: " + getClass().getSimpleName());
        System.out.println("Positions from the Sun: " + this.position);
        System.out.println("Type: " + this.type);
        System.out.printf("Diameter: %.2f km%n", this.diameter);
        System.out.println("Mass: " + mass + " kg");
    }
}
