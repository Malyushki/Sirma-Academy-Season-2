import java.util.Scanner;
class Triangle{
    int a;
    int b;
    int c;
    double alpha;
    double beta;
    double gama;
}
public class EX_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("SIDE A:");
        int a = scanner.nextInt();
        System.out.println("SIDE B:");
        int b = scanner.nextInt();
        System.out.println("SIDE C:");
        int c = scanner.nextInt();

        if (a+b>c && a+c>b && c+b>a){
            Triangle triangle = new Triangle();
            triangle.a = a;
            triangle.b = b;
            triangle.c = c;

            System.out.println("P is: "+(triangle.a+triangle.b+triangle.c));
        }else {
            System.out.println("No triangle cant be formed");
        }
    }
}
