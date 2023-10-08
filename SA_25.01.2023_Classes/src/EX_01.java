package src;

import java.util.Scanner;
 class Triangle{
    double a ;
    double h ;
    public double area(){
        if (a<0){
            return -1;
        }
        if (h<0){
            return -1;
        }
        return a*h/2;
    }
}
public class EX_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();
        System.out.println("Set a:");
        triangle.a = scanner.nextDouble();
        System.out.println("Set h:");
        triangle.h = scanner.nextDouble();


        System.out.println(triangle.area());

    }
}
