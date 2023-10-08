import java.util.*;
import java.util.stream.Collectors;

public class EX_STACK_04_15_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers in list:");
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(",")).map(Integer::parseInt).collect(Collectors.toList());

        System.out.println("Enter number: ");
        int number = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> newNumbersStack = new ArrayDeque<>();

        for (int i = 0; i < numbersList.size(); i++) {
            newNumbersStack.push(number);
            newNumbersStack.push(numbersList.get(i));
        }
        printReversedStack(newNumbersStack);

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
