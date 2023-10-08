package EX_02_08_03_2023;

public class Triangle extends Figure {

    public double sideA;
    public double sideB;
    public double sideC;
    public double h;


    public Triangle(double sideA, double sideB, double sideC, double h) {
        // Figure(double perimeter, double area)
        super((sideA + sideB + sideC), sideB * h / 2);

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.h = h;
    }

    public void calcTrianglePerimeter() {
        //        P = a + b + c
        this.perimeter = sideA + sideB + sideC;

    }

    public void calcTriangleArea() {
        //         A = 1/2 bh
        this.area = sideB * h / 2;

    }
}
