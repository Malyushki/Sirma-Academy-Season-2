import java.util.Scanner;

public class WA_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many?");
        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];
        int[] oddArr = new int[n];
        int counter = 0;
        System.out.println("Enter numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
            if (numbers[i] % 2 == 0 && numbers[i] > 0) {
                oddArr[counter] = numbers[i];
                counter++;
            }
        }
        for (int e:oddArr) {

            System.out.print(e+" ");
        }
    }
}
