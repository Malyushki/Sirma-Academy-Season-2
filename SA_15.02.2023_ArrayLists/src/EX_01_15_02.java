import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EX_01_15_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers in list:");
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(",")).map(Integer::parseInt).collect(Collectors.toList());
        System.out.println("Enter split number:");
        int number= Integer.parseInt(scanner.nextLine());

       int indexOfSplitNumber =  numbersList.indexOf(number);
        List<Integer> leftPart = new ArrayList<>();
        List<Integer> rightPart = new ArrayList<>();
        for (int i = 0; i <numbersList.size() ; i++) {
            if (i<indexOfSplitNumber){
                leftPart.add(numbersList.get(i));
            }else if (i>indexOfSplitNumber){
                rightPart.add(numbersList.get(i));
            }

        }
        System.out.println("Result:");
        System.out.println("New list one:");
        System.out.println(leftPart.toString());
        System.out.println("New list two:");
        System.out.println(rightPart.toString());
    }
}
/*Пример:
Вход:
{1,4,7,6,5,2,1,3}
7
Изход:
{1,4}
{6,5,2,1,3}
*/