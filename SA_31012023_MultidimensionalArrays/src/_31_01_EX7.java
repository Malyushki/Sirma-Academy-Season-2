import java.util.Scanner;

public class _31_01_EX7 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int x = 3;
        fillMatrix(matrix, scanner);
        System.out.println("Matrix before");
        printMatrix(matrix);
        System.out.println("Matrix After");
        swapDivByXWith0(matrix, x);


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

    public static void swapDivByXWith0(int[][] matrix, int x) {
        int[][] swappedMatrix = new int[matrix.length][matrix[0].length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] % 3 == 0) {
                    swappedMatrix[row][col] = 0;
                } else {
                    swappedMatrix[row][col] = matrix[row][col];
                }
            }
        }
        printMatrix(swappedMatrix);

    }
}

