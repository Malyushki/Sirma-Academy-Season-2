import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class EX_01_28_02_2023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter day");
        int day = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter month");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter year");
        int year = Integer.parseInt(scanner.nextLine());

        try {


            LocalDate userDate = LocalDate.of(year, month, day);
            LocalDate newYear = LocalDate.of(2023, 1, 1);
            Period period = Period.between(newYear, userDate);


            if (userDate.compareTo(newYear) > 0) {
                System.out.printf("%s Days %s Months %s Years", period.getDays(), period.getMonths());

            } else {
                System.out.println("Error");
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}