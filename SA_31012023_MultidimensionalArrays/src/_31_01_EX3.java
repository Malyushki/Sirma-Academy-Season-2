import java.util.Scanner;

public class _31_01_EX3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] numbers = new int[4][4];
        fillMatrix(numbers, scanner);
        int primeDiagonal = 0;
        int secondaryDiagonal = 0;

        for (int rowAndCol = 0; rowAndCol < numbers.length; rowAndCol++) {
            primeDiagonal += numbers[rowAndCol][rowAndCol];

        }
        for (int rowAndCol = 0; rowAndCol < numbers.length; rowAndCol++) {
            secondaryDiagonal += numbers[rowAndCol][numbers.length - rowAndCol - 1];

        }
        printMatrix(numbers);
        System.out.println(primeDiagonal);
        System.out.println(secondaryDiagonal);

        if (primeDiagonal > secondaryDiagonal) {
            System.out.println("Prime diagonal is a bigger number");
        } else if (secondaryDiagonal > primeDiagonal) {
            System.out.println("Secondary diagonal is a bigger number");
        } else {
            System.out.println("They are equal");
        }

    }


    public static void fillMatrix(int[][] numbers, Scanner scanner) {
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[0].length; col++) {
                //    System.out.printf("Enter number for row[%d] col [%d]: %n", row, col);
                //    numbers[row][col] = Integer.parseInt(scanner.nextLine());
                numbers[row][col] = row + col + 1;
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

}
