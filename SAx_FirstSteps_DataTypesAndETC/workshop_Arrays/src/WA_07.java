import java.util.Scanner;

public class WA_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers1 = new int[10];
        int [] numbers2 = new int[10];
        int [] sumArr = new int[10];

        for (int i = 0; i <10 ; i++) {
            System.out.print("Enter number Arr1: ");
            numbers1[i] = scanner.nextInt();
        }
        for (int i = 0; i <10 ; i++) {
            System.out.print("Enter number Arr2: ");
            numbers2[i] = scanner.nextInt();
        }

        for (int i = 0; i <10; i++) {
            sumArr[i] = numbers1[i] +numbers2[i];
            System.out.print(sumArr[i] + " ");
        }
    }
}
