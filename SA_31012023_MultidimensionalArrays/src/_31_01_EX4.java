import java.util.Scanner;

public class _31_01_EX4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] numbers = new int[3][3];
        fillMatrix(numbers, scanner);
        printMatrix(numbers);
        System.out.println("NOW ROTATED 90");
        printRotatedMatrix90(numbers);
    }

    public static void fillMatrix(int[][] numbers, Scanner scanner) {
        int count = 1;
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[0].length; col++) {
                //    System.out.printf("Enter number for row[%d] col [%d]: %n", row, col);
                //    numbers[row][col] = Integer.parseInt(scanner.nextLine());
                numbers[row][col] = count;
                count++;
            }
        }
    }

    public static void printMatrix(int[][] numbers) {
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[0].length; col++) {
                System.out.print(numbers[row][col] + " ");

            }
            System.out.println();
        }
    }

    public static void printRotatedMatrix90(int[][] numbers) {
        int rows = numbers.length;
        int cols = numbers[0].length;
        for (int col = 0; col < cols; col++) {
            for (int row = rows-1; row >=0 ; row--) {
                System.out.print(numbers[row][col] + " ");
            }
            System.out.println();
        }

    }
}

