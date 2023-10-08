import java.util.Scanner;

class Point4 {
    private double x;
    private double y;

    public Point4(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}

public class EX_02_28_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point4 pointOne = new Point4(0,0);
        Point4 pointTwo = new Point4(0,0);
        System.out.println("Enter firsts point x:");
        pointOne.setX(scanner.nextInt());
        System.out.println("Enter firsts point y:");
        pointOne.setY(scanner.nextInt());
        System.out.println("Enter second point x:");
        pointTwo.setX(scanner.nextInt());
        System.out.println("Enter second point y:");
        pointTwo.setY(scanner.nextInt());
        double distance = Math.pow((pointOne.getX() - pointTwo.getX()), 2) + Math.pow((pointOne.getY() - pointTwo.getY()), 2);
        distance = Math.sqrt(distance);
        System.out.println("The distance is: " + distance);

    }
}
