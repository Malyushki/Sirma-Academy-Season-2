package EX_02_08_03_2023;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Semicircle semicircle = new Semicircle(5);
        Rectangle rectangle = new Rectangle(5, 4);
        Square square = new Square(5);
        Triangle triangle = new Triangle(5, 5, 5, 5);
        Ellipse ellipse = new Ellipse(5, 5);
        System.out.println(circle);
        System.out.println(semicircle);
        System.out.println(rectangle);
        System.out.println(square);
        System.out.println(triangle);
        System.out.println(ellipse);
    }
}
