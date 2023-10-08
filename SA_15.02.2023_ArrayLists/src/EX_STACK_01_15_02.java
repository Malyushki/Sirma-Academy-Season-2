import java.util.*;
import java.util.stream.Collectors;

public class EX_STACK_01_15_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers in list:");
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(",")).map(Integer::parseInt).collect(Collectors.toList());
        System.out.println("Enter split number:");
        int number= Integer.parseInt(scanner.nextLine());

       int indexOfSplitNumber =  numbersList.indexOf(number);
        ArrayDeque<Integer> leftPart = new ArrayDeque<>();
        ArrayDeque<Integer> rightPart = new ArrayDeque<>();
        for (int i = 0; i <numbersList.size() ; i++) {
            if (i<indexOfSplitNumber){
                leftPart.push(numbersList.get(i));
            }else if (i>indexOfSplitNumber){
                rightPart.push(numbersList.get(i));
            }

        }

        System.out.println("Result:");
        System.out.println("New list one:");
        String leftPartString = null;
        String rightPartString = null;
        StringBuilder sb = new StringBuilder();
        for (Integer e:leftPart) {

            sb.append(leftPart.pop());
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.reverse();
        leftPartString = sb.toString();
        System.out.println(leftPartString);
        sb = new StringBuilder();
        for (Integer e:rightPart) {

            sb.append(rightPart.pop());
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.reverse();
        rightPartString=sb.toString();
        System.out.println("New list two:");


        System.out.println(rightPartString.toString());
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