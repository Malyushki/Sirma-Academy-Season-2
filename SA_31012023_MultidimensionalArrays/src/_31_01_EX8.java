import java.util.Scanner;

public class _31_01_EX8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[4][4];

        fillMatrix(matrix, scanner);

        System.out.println("Matrix before");
        printMatrix(matrix);
        // swapNeighbors(matrix);
        swapNeighborsRows2(matrix);
        System.out.println("Matrix After");
        printMatrix(matrix);


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

    public static void swapNeighbors(int[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col += 2) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[row][col + 1];
                matrix[row][col + 1] = temp;

            }
        }
    }

    public static void swapNeighborsRows(int[][] matrix) {

        for (int row = 0; row < matrix.length; row += 2) {
            for (int col = 0; col < matrix[0].length; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[row + 1][col];
                matrix[row + 1][col] = temp;

            }
        }


    }
    public static void swapNeighborsRows2(int[][] matrix) {

        for (int row = 0; row < matrix.length; row += 2) {
                int[] temp = matrix[row];
                matrix[row] = matrix[row + 1];
                matrix[row + 1] = temp;
            }
        }



}



