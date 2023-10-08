import java.util.Scanner;

public class WH_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();
            int averageSum = 0;
            int count= 0;
            while (!input.equals("q")){
                double a = Double.parseDouble(input);
                averageSum += a;
                count++;
                input = scanner.nextLine();
            }
            averageSum = averageSum/count;

        System.out.println(averageSum);
    }
}
