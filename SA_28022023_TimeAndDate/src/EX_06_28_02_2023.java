import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class EX_06_28_02_2023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LocalDate nextLeapYear = LocalDate.now();
        LocalDate lastLeapYear = LocalDate.now();
        while (!nextLeapYear.isLeapYear()) {
            nextLeapYear = nextLeapYear.plusYears(1);

        }

        while (!lastLeapYear.isLeapYear()) {
            lastLeapYear = lastLeapYear.minusYears(1);
        }
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy");

        System.out.println("Next leap year is:  "+nextLeapYear.format(dateFormatter));
        System.out.println("Last leap year is:  "+lastLeapYear.format(dateFormatter));
    }
}