import java.util.Scanner;

public class WH_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (input.length() != 4) {
            System.out.println("You need to enter four digit numbers: ");
            input = scanner.nextLine();
       }

      int firstTwoDigitSum = Integer.parseInt(String.valueOf(input.charAt(0)))+
                             Integer.parseInt(String.valueOf(input.charAt(1)));

        int secondTwoDigitSum = Integer.parseInt(String.valueOf(input.charAt(2)))+
                                Integer.parseInt(String.valueOf(input.charAt(3)));
        System.out.println((firstTwoDigitSum>secondTwoDigitSum));

    }

}
