import java.util.Arrays;
import java.util.Scanner;

public class EX_08_18_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter words:");
        String[] command = scanner.nextLine().split("\\s+");
        Arrays.sort(command);

        System.out.println("Result:");
        System.out.println(Arrays.toString(command).replaceAll("[\\[\\]]",""));



    }
}
