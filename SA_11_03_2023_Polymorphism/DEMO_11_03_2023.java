

class Arithmetic {
    // Overloading
    public int add(int a, int b) {
        return a + b;
    }

    // different arguments types
    public double add(double a, double b) {
        return a + b;
    }

    // different number of arguments
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static int add(int[] args) {
        int sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }

    // Overriding
    public int multi(int a, int b) {
        return a * b;
    }

    public static double multiply(double[] args) {
        System.out.println("Original");

        double prod = 1;
        for (double arg : args) {
            prod *= arg;
        }

        return prod;
    }
}

class IntArithmetic extends Arithmetic {

    // Overriding
    @Override
    public int multi(int a, int b) {
        System.out.println("Override");
        return a * b;
    }

    // Hiding
    public static double multiply(double[] args) {
        System.out.println("Hide");
        int prod = 1;
        for (double arg : args) {
            prod *= arg;
        }
        return (int) prod;
    }


}

public class DEMO_11_03_2023 {
    static class   Main {
        public static void main(String[] args) {

            Arithmetic a = new Arithmetic();

            System.out.println(a.add(1, 2));
            System.out.println(a.add(3.0, 4.5));
            System.out.println(a.add(1, 2, 3));
            int[] numbs = {1, 2, 3, 4, 5};
            double[] dNumbs = {1.9, 2.1, 3.2, 4.0, 5.1};

            System.out.println(Arithmetic.add(numbs));

            IntArithmetic ia = new IntArithmetic();
            System.out.println(ia.add(1, 2));
            System.out.println(ia.add(3.0, 4.5));
            System.out.println(ia.add(1, 2, 3));
            System.out.println(a.multi(1, 2));
            System.out.println(ia.multi(1, 2));
            System.out.println(Arithmetic.multiply(dNumbs));
            System.out.println(IntArithmetic.multiply(dNumbs));

        }
    }
}