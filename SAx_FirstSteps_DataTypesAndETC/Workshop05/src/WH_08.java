import java.util.Scanner;

public class WH_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter second number: ");
        int num2 = Integer.parseInt(scanner.nextLine());
        int fistDigitNum1 = 0;
        int fistDigitNum2 = 0;

        while (num1 > 0) {
            fistDigitNum1 = num1 % 10;
            num1 /= 10;

        }
        while (num2 > 0) {
            fistDigitNum2 = num2 % 10;
            num2 /= 10;
        }

        if (fistDigitNum1 == fistDigitNum2) {
            System.out.println("First digits fro both numbers are even%n");
        } else if ((fistDigitNum1 > fistDigitNum2)) {
            System.out.printf("The first number's first digit ( %d ) is bigger.%n", fistDigitNum1);
        } else {
            System.out.printf("The second number's first digit ( %d ) is bigger.%n", fistDigitNum2);
        }

    }
}


