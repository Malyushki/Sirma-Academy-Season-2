import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EX_02_15_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = Integer.parseInt(scanner.nextLine());
        List<Integer> numbersByFormulaList = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            double numberToAdd = (Math.pow(-i, 2) + 3 * i - 2);
            numbersByFormulaList.add((int)numberToAdd);

        }
        System.out.println("Your list:");
        System.out.println(numbersByFormulaList);
    }
}
