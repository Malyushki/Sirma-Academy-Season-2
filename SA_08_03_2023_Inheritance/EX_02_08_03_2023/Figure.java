package EX_02_08_03_2023;

public class Figure {
    public double perimeter;
    public double area ;

    public Figure(double perimeter, double area) {
        this.perimeter = perimeter;
        this.area = area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return String.format("Perimeter is %.2f. Area is %.2f",this.perimeter,this.area);
    }
}
