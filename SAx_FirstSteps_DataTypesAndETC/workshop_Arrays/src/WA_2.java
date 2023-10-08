import java.util.Scanner;

public class WA_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many?");
        int n = Integer.parseInt(scanner.nextLine());
        int [] numbers = new int[n];
        int sum = 0;
        int sumProduct = 1;
        double average = 0;
        System.out.println("Enter numbers: ");
        for (int i = 0; i <n ; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
            sum+=numbers[i];
            sumProduct*=numbers[i];
        }
         average = sum*1.00 /numbers.length;

        System.out.println("Sum is:"+sum);
        System.out.println("Product is:"+sumProduct);
        System.out.println("Average is:"+average);

    }
}
