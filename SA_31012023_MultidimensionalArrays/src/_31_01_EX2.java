import java.util.Scanner;

public class _31_01_EX2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] numbers = new int[4][4];
        fillMatrix(numbers, scanner);
        int[] sums = new int[4];


        for (int row = 0; row < 4; row++) {
            for (int col = 0; col <4 ; col++) {
                sums[row] += numbers[row][col];
            }
        }
        for (int i = 0; i < sums.length; i++) {
            System.out.print(sums[i] + " ");
        }

    }
    public static void fillMatrix(int[][] numbers, Scanner scanner) {
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[0].length; col++) {
                System.out.printf("Enter number for row[%d] col [%d]: %n", row, col);
                numbers[row][col] = Integer.parseInt(scanner.nextLine());
            }
        }
    }
}
