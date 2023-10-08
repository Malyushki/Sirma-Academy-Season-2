import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class EX_03_28_02_2023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        try {
            System.out.println("Enter date");
            int[] date1 = Arrays.stream(scanner.nextLine().split("\\.|\\-|\\/")).mapToInt(Integer::parseInt).toArray();

            LocalDate date = LocalDate.of(date1[2], date1[1], date1[0]);
            LocalDate datePlus2Months = date.plusDays(60);
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            System.out.println("Date after 60 days: "+datePlus2Months.format(myFormatObj));



        } catch (Exception e) {
            System.out.println("Enter date in format dd.MM.yyyy");
            e.printStackTrace();

        }
    }
}