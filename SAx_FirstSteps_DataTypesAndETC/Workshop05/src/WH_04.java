import java.util.Scanner;

public class WH_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int counter = 0;

        while (!input.equals("q")) {
            double number = Double.parseDouble(input);
             if (number%2==0){
                 counter++;
             }


            input = scanner.nextLine();
        }
        System.out.println("Number of even numbers: "+ counter);
    }
}
