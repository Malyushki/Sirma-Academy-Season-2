import java.util.Scanner;

public class WA_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers? ");
        int n = Integer.parseInt(scanner.nextLine());
        int [] numbers = new int[n];

        for (int i = 0; i <n ; i++) {
            System.out.print("Enter number: ");
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            int counter = 0;
            for (int j = 0; j <n ; j++) {
               if (numbers[i]==numbers[j]) {
                   counter++;
               }
            }
            System.out.printf("Number %d : %d times in the array%n",numbers[i],counter);
        }
        }
    }

