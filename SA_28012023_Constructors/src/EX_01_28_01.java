import java.util.Scanner;

class Rational2 {
    private int numerator;
    private int denominator;

    public Rational2(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
}


public class EX_01_28_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rational2 firstRational = new Rational2(scanner.nextInt(),scanner.nextInt());
        Rational2 secondRational = new Rational2(scanner.nextInt(),scanner.nextInt());


        int numerator = firstRational.getNumerator() * secondRational.getDenominator() + secondRational.getNumerator() * firstRational.getDenominator();
        int denominator = firstRational.getDenominator() * secondRational.getDenominator();

        System.out.print(numerator);
        System.out.print("/");
        System.out.print(denominator);


    }
}
