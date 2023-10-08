import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class EX_06_26_02_2023 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        double[] numbersArr = new double[10];
        int size = 10;
        for (int i = 0; i < size; i++) {
            numbersArr[i] = random.nextGaussian();
        }

        int count = 1;
        for (double n : numbersArr) {

            System.out.printf("N%d. %f%n", count, n);
            count++;
        }

        double average = Arrays.stream(numbersArr).sum() / size;
        double[] diff = new double[10];
        for (int i = 0; i < size; i++) {
            diff[i] = Math.abs(numbersArr[i] - average);
        }
        double variation = Arrays.stream(diff).sum() / size;


        System.out.println("Average sum is: " + average);
        System.out.println("Variance sum is: " + variation);
        System.out.println("Standard deviation is: " + Math.sqrt(variation));


    }
}