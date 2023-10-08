import java.util.Scanner;

public class _31_01_EX5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix1 = new int[3][3];
        fillMatrix(matrix1, scanner);
        int[][] matrix2 = new int[3][3];
        fillMatrix(matrix2, scanner);
        System.out.println("First Matrix");
        printMatrix(matrix1);
        System.out.println("Second Matrix");
        printMatrix(matrix2);
        System.out.println("Multiplied Matrix");
        multiplyTwoMatrices(matrix1,matrix2);



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
    public static void multiplyTwoMatrices(int[][] matrix1,int[][] matrix2 ) {
        int[][] multipliedMatrix = new int[matrix1.length][matrix1[0].length];
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[0].length; col++) {
                multipliedMatrix[row][col] = matrix1[row][col] * matrix2[row][col];
            }
        }
        printMatrix(multipliedMatrix);

    }
}
