import java.util.Scanner;

public class WA_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers? ");
        int n = Integer.parseInt(scanner.nextLine());
        int [] numbers = new int[n];

        for (int i = 0; i <n ; i++) {
            System.out.print("Enter number: ");
            numbers[i] = scanner.nextInt();
            if (numbers[i]%2==0){
                numbers[i] = 0;
            }

        }
        for (int i = 0; i <n ; i++) {
            System.out.println(numbers[i]);
        }

    }
}
