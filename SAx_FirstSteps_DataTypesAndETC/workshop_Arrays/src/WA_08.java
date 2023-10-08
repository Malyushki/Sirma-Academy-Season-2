import java.util.Scanner;

public class WA_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers? ");
        int n = input.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter: ");
            numbers[i] = input.nextInt();
        }
        int[] primeNumbers = new int[n];
        int count = 0;
        for (int number : numbers) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {

                primeNumbers[count] = number;
                count++;
            }
        }
        System.out.println("Number of primes in your array: " + count);

        for (int primeNumber : primeNumbers) {
            if (primeNumber != 0) {
                System.out.println(primeNumber + " ");
            }
        }
    }
}

