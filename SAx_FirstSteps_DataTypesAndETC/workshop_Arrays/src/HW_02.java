import java.util.Scanner;

public class HW_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        String[] input = scanner.nextLine().split("\\s+");
        int[] numbers = new int[input.length];
        int[] oddNumbers = new int[input.length];
        int[] evenNumbers = new int[input.length];
        int counterEven = 0;
        int counterOdd = 0;

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < input.length; i++) {

            if (numbers[i] % 2 == 0) {
                evenNumbers[counterEven] = numbers[i];
                counterEven++;
            }
            if (numbers[i] % 2 == 1) {
                oddNumbers[counterOdd] = numbers[i];
                counterOdd++;
            }

        }
        for (int i = 0; i < counterOdd; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < counterEven; i++) {
            System.out.print(evenNumbers[i] + " ");
        }


    }
}
