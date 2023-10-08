package EX_02_08_03_2023;

public class Semicircle extends Figure {

    public double radius;

    public Semicircle(double radius) {
        // Figure(double perimeter, double area) {
        super((2 * radius + radius * Math.PI), ((radius * radius * Math.PI)/2));
        this.radius = radius;
    }

    public void calcSemicirclePerimeter() {
        // P = πr + 2r
        this.perimeter = 2 * radius + radius * Math.PI;

    }

    public void calcSemicircleArea() {
        //A = 1/2 πr^2
        this.area =  (radius * radius * Math.PI)/2;

    }
}
