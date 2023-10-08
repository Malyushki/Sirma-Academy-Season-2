import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EX_08_28_02_2023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("Enter date1");
            int[] dateInput1 = Arrays.stream(scanner.nextLine().split("\\.|\\-|\\/")).mapToInt(Integer::parseInt).toArray();
            LocalDate date1 = LocalDate.of(dateInput1[2], dateInput1[1], dateInput1[0]);
            System.out.println("Enter date2");
            int[] dateInput2 = Arrays.stream(scanner.nextLine().split("\\.|\\-|\\/")).mapToInt(Integer::parseInt).toArray();
            LocalDate date2 = LocalDate.of(dateInput2[2], dateInput2[1], dateInput2[0]);

            int countLeapYears = 0;
            if (date1.getYear() < date2.getYear()) {
                while (date1.getYear() <= date2.getYear()) {
                    if (date1.isLeapYear()) {
                        countLeapYears++;

                    }
                    date1 = date1.plusYears(1);
                }
            } else {
                while (date1.getYear() >= date2.getYear()) {
                    if (date1.isLeapYear()) {
                        countLeapYears++;

                    }
                    date1 = date1.minusYears(1);


                }
            }

            System.out.println("There are: " + countLeapYears + " Leap years between this period");

        } catch (Exception e) {
            System.out.println("Enter date in format dd.MM.yyyy");
            e.printStackTrace();

        }
    }
}