import java.util.Scanner;

public class WH_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        String input = scanner.nextLine();
        System.out.print("Your reversed number is: ");
        for (int i = input.length()-1; i >=0 ; i--) {
            System.out.print(input.charAt(i));

        }



    }
}
