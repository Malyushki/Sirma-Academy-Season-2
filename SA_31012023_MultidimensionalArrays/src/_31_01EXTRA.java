import java.util.Random;
import java.util.Scanner;

public class _31_01EXTRA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[4][4];
        fillMatrix(matrix,scanner);
        System.out.println("Before:");
        printMatrix(matrix);

        System.out.println("After:");
        bubbleSortMatrix(matrix);
        printMatrix(matrix);


    }
    public static void fillMatrix(int[][] numbers, Scanner scanner) {
        Random random = new Random();

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[0].length; col++) {

                //    System.out.printf("Enter number for row[%d] col [%d]: %n", row, col);
                //    numbers[row][col] = Integer.parseInt(scanner.nextLine());
                numbers[row][col] =  random.nextInt(201);

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
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }
    public static void bubbleSortMatrix(int[][] matrix) {

        for (int row = 0; row < matrix.length; row ++) {
          bubbleSort(matrix[row]);
        }
    }

}
