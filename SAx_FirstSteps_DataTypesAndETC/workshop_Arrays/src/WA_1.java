import java.util.Scanner;

public class WA_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many?");
        int n = Integer.parseInt(scanner.nextLine());
        int [] numbers = new int[n];
        System.out.println("Enter numbers: ");
        for (int i = 0; i <n ; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());

        }
        System.out.println("Reverse order:");
        for (int i = n-1; i >=0 ; i--) {
            System.out.println(numbers[i]);
        }


    }
}
