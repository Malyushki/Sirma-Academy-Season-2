package EX_02_08_03_2023;

public class Ellipse extends Figure {

    public double radiusA;
    public double radiusB;

    public Ellipse(double radiusA, double radiusB) {
        // Figure(double perimeter, double area) {
        super((2 * Math.PI * (Math.sqrt((radiusA * radiusA + radiusB * radiusB) / 2))), (radiusA * radiusB * Math.PI));
        this.radiusA = radiusA;
        this.radiusB = radiusB;
    }

    public void calcCirclePerimeter() {
        //
        this.perimeter = 2 * Math.PI * (Math.sqrt((this.radiusA * this.radiusA + this.radiusB * this.radiusB) / 2));

    }

    public double calcCircleArea() {
        //    A = πab
        return radiusA * radiusB * Math.PI;
    }
}
