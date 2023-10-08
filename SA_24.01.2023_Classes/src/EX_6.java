import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Date {
    int dateOfMonth;
    String month;
    String dayOfWeek;
    int year;

}

public class EX_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> daysOfWeek = Arrays.asList("monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday");
        List<String> months = Arrays.asList("january", "february", "march", "april", "may", "june", "july",
                "august", "september", "october", "november", "december");
        System.out.println("DATE OF MONTH: ");
        int dateOfMonth = Integer.parseInt(scanner.nextLine());
        System.out.println("MONTH: ");
        String month = scanner.nextLine().toLowerCase();
        System.out.println("Day of the week: ");
        String dayOfWeek = scanner.nextLine().toLowerCase();
        System.out.println("Year: ");
        int year = Integer.parseInt(scanner.nextLine());

        if (year > 0) {
            if (months.contains(month)) {
                if (dateOfMonth > 0 && dateOfMonth < 31) {
                    if (daysOfWeek.contains(dayOfWeek)) {
                    Date date = new Date();
                         date.dateOfMonth = dateOfMonth;
                         date.month=month;
                         date.dayOfWeek=dayOfWeek;
                        date.year=year;
                        System.out.printf("%d.%s.%d /%s/",date.dateOfMonth,date.month,date.year,date.dayOfWeek);

                    }
                }
            }
        }


    }
}
