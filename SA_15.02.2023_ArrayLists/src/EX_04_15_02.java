import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EX_04_15_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers in list:");
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(",")).map(Integer::parseInt).collect(Collectors.toList());

        System.out.println("Enter number: ");
        int number = Integer.parseInt(scanner.nextLine());
        List<Integer> newNumbersList = new ArrayList<>();

        for (int i = 0; i < numbersList.size(); i++) {
            newNumbersList.add(number);
            newNumbersList.add(numbersList.get(i));
        }
        System.out.println("Your list:");
        System.out.println(newNumbersList.toString().replaceAll("[\\[\\],]",""));

    }
}
