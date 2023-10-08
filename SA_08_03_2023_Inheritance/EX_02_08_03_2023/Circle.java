package EX_02_08_03_2023;

public class Circle extends Figure {

    public double radius;

    public Circle(double radius) {
        // Figure(double perimeter, double area) {
        super((2 * radius * Math.PI), (radius * radius * Math.PI));
        this.radius = radius;
    }

    public void calcCirclePerimeter() {
        this.perimeter = 2 * radius * Math.PI;

    }

    public double calcCircleArea() {

        return radius * radius * Math.PI;
    }
}
