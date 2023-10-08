package EX_02_08_03_2023;

public class Rectangle extends Figure {

    public double length;
    public double wide;

    public Rectangle(double length, double wide) {
        // Figure(double perimeter, double area)
        super((2 * (length + wide)), length * wide);

        this.length = length;
        this.wide = wide;
    }

    public void calcRectanglePerimeter() {
        //         P = 2(l+w)
        this.perimeter = 2 * (length + wide);

    }

    public void calcRectangleArea() {
        //A = lw
        this.area = (length * wide);

    }
}
