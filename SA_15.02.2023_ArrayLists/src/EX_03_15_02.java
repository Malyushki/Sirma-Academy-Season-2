import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EX_03_15_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = Integer.parseInt(scanner.nextLine());
        List<Integer> numbersByFormulaList = new ArrayList<>();
        for (int i = 0; i <=number ; i++) {
            numbersByFormulaList.add((int)Math.pow(2,i));

        }
        System.out.println("Your list:");
        System.out.println(numbersByFormulaList.toString().replaceAll("[\\[\\],]",""));
    }
}
