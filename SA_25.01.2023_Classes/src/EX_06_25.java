import java.util.Scanner;
class Equation{

    public static void makeEquation(int p,int q){

        String print = "x^2-"+  (p +q)+"x+"+p*q+"x";
        System.out.println(print);
    }
}
public class EX_06_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int p = scanner.nextInt();
       int q = scanner.nextInt();
        Equation.makeEquation(p,q);
    }
}
