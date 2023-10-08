import java.util.Scanner;

public class WA_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers? ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            numbers[i] = scanner.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (numbers[i]<min){
                min = numbers[i];
            }
            if (numbers[i]>max){
                max = numbers[i];
            }
        }
        System.out.println("Biggest number: "+ max);
        System.out.println("Smallest number: "+ min);

    }
}