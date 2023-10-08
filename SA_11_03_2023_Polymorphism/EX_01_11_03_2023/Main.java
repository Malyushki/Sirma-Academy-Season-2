package EX_01_11_03_2023;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input1 = Integer.parseInt(scanner.nextLine());

        String input2 = scanner.nextLine();

        try {
            int num2 = Integer.parseInt(input2);
            multiply(input1, num2);
            return;
        } catch (NumberFormatException e) {


        }
        multiply(input1, input2);


    }

    public static void multiply(int numb1, int numb2) {
        System.out.println(numb1 * numb2);
    }

    public static void multiply(int numb, String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numb; i++) {
            result.append(str);
        }
        System.out.println(result);
    }
}
