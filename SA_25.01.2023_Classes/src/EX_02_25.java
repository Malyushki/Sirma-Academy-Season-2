import java.util.Scanner;
class Point {
    double x1;
    double x2;
    double y1;
    double y2;

    public double distance(){

      return   Math.sqrt( Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2));

    }
}
public class EX_02_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point point = new Point();
        point.x1 = scanner.nextDouble();
        point.x2 = scanner.nextDouble();
        point.y1 = scanner.nextDouble();
        point.y2 = scanner.nextDouble();
        System.out.println(point.distance());
    }
}
