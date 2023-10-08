import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EX_STACK_02_15_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> numbersByFormulaStack = new ArrayDeque<>();

        for (int i = 0; i < number; i++) {
            double numberToAdd = (Math.pow(-i, 2) + 3 * i - 2);
            numbersByFormulaStack.push((int)numberToAdd);

        }

        printReversedStack(numbersByFormulaStack);


    }
    public static void printReversedStack( ArrayDeque<Integer> stack){
        ArrayDeque<Integer> reverseStack = new ArrayDeque<>();
        for (Integer e:stack) {
            reverseStack.push(stack.pop());

        }
        System.out.println("Your list:");
        System.out.println(reverseStack.toString().replaceAll("[\\[\\],]",""));
    }
}
