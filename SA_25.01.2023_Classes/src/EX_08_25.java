import java.util.Arrays;
import java.util.Scanner;

class Average {


    public static boolean checkAverage(double[] arr1, double[] arr2) {
        double avarage1 = 0;
        double avarage2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            avarage1 += arr1[i];
        }
        avarage1 = avarage1 / arr1.length;
        for (int i = 0; i < arr2.length; i++) {
            avarage2 += arr2[i];
        }
        avarage2 = avarage2 / arr2.length;
        return avarage1 == avarage2;
    }

}

public class EX_08_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] arr1 = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        double[] arr2 = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        System.out.println(Average.checkAverage(arr1, arr2));

    }
}
