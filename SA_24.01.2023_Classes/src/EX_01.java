import java.util.Scanner;

class Rational {
    public int numerator;
    public int denominator;


}

public class EX_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rational firstRational = new Rational();
        Rational secondRational = new Rational();
        System.out.println("Enter firsts number numerator:");
        firstRational.numerator = scanner.nextInt();
        System.out.println("Enter firsts number denominator:");
        firstRational.denominator = scanner.nextInt();
        System.out.println("Enter second number numerator:");
        secondRational.numerator = scanner.nextInt();
        System.out.println("Enter second number denominator:");
        secondRational.denominator = scanner.nextInt();

        int numerator = firstRational.numerator*secondRational.denominator + secondRational.numerator * firstRational.denominator;
        int denominator = firstRational.denominator * secondRational.denominator;

        System.out.print(numerator);
        System.out.print("/");
        System.out.print(denominator);


    }
}
