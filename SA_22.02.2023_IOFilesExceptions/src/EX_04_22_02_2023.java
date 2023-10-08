import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class EX_04_22_02_2023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter floating number:");
        double number = Double.parseDouble(scanner.nextLine());

        try {
            double result = 1 / Math.sin(number);
            System.out.println("Result is: " + result);
        } catch (Exception e) {

            System.out.println("This value of the argument is not valid");


        }


    }

}