import java.util.Scanner;

public class HW_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N numbers: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int[] oddIndex = new int[n];
        int[] evenIndex = new int[n];
        int counterEven = 0;
        int counterOdd = 0;
        System.out.println("Enter number array: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                evenIndex[counterEven] = numbers[i];
                counterEven++;
            }
            if (i % 2 == 1) {
                oddIndex[counterOdd] = numbers[i];
                counterOdd++;
            }

        }

        for (int i = 0; i < counterEven; i++) {
            System.out.print(evenIndex[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < counterOdd; i++) {
            System.out.print(oddIndex[i] + " ");
        }


    }
}
