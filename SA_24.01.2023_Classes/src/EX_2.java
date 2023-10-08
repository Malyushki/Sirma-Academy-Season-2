import java.util.Scanner;
 class Point3 {
        double x;
        double y;


}
public class EX_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point3 pointOne = new Point3();
        Point3 pointTwo = new Point3();
        System.out.println("Enter firsts point x:");
        pointOne.x = scanner.nextInt();
        System.out.println("Enter firsts point y:");
        pointOne.y = scanner.nextInt();
        System.out.println("Enter second point x:");
        pointTwo.x = scanner.nextInt();
        System.out.println("Enter second point y:");
        pointTwo.y = scanner.nextInt();
        double distance = Math.pow((pointOne.x - pointTwo.x),2) + Math.pow((pointOne.y - pointTwo.y),2);
        distance = Math.sqrt(distance);
        System.out.println("The distance is: "+distance);

    }
}
