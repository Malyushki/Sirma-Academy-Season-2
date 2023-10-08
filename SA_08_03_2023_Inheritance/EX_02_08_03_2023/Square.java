package EX_02_08_03_2023;

public class Square extends Figure {

    public double side;


    public Square(double side) {
        // Figure(double perimeter, double area)
        super((4 * side), side * side);

        this.side = side;

    }

    public void calcSquarePerimeter() {
        //       	P = 4s
        this.perimeter = 4 * side;

    }

    public void calcSquareArea() {
        //A = s^2
        this.area = side * side;

    }
}
