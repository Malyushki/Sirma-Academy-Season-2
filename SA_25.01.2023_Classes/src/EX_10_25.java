import java.util.Scanner;

class Series {
    public static int series(int n) {
        if (n <= 0) {
            System.out.println("Invalid number");
            return -1;
        }
        if (n <= 3) {
            return 1;
        } else {
            return series(n - 1) + series(n - 2) + series(n - 3);

        }

    }
}

public class EX_10_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Series.series(n));
    }
}
