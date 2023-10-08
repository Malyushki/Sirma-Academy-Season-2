import java.util.Scanner;

public class HW_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N numbers: ");
        int n = scanner.nextInt();
        System.out.println("Enter number array: ");
        int[] numbers1 = new int[n];
        int[] numbers2 = new int[n];
        int[] multipliedNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers1[i] = scanner.nextInt();
        }
        for (int i = n-1; i >=0; i--) {
            numbers2[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            multipliedNumbers[i] =  numbers2[i] * numbers1[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(multipliedNumbers[i] + " ");
        }
    }
}
