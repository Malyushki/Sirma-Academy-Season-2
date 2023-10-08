import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DEMO_28_02_2023 {
    public static void main(String[] args) {
        // Create date
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDate date2 = LocalDate.of(2025, 1, 1);

        System.out.println(date2);

        if (date2.equals(date)){
            System.out.println("The two dates coincide");
        }
        else{
            System.out.println("The two dates don't coincide");
        }

        // subtract time
        LocalDate diff = date.minus(10, ChronoUnit.DAYS);
        System.out.println(diff);
        diff = date.minus(10, ChronoUnit.MONTHS);
        System.out.println(diff);
        diff = date.minus(10, ChronoUnit.YEARS);
        System.out.println(diff);

        //Add time
        diff = date.plus(10, ChronoUnit.DAYS);
        System.out.println(diff);
        diff = date.plus(10, ChronoUnit.MONTHS);
        System.out.println(diff);
        diff = date.plus(10, ChronoUnit.YEARS);
        System.out.println(diff);

        // Calculate difference between dates
        System.out.println(date.until(date2, ChronoUnit.MONTHS));
        System.out.println(date.until(date2, ChronoUnit.YEARS));

        // Calculate difference between dates
        Period period = Period.between(date, date2);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());


        // Create time
        LocalTime time = LocalTime.now();

        System.out.println(time);


        // Create datetime
        LocalDateTime datetime = LocalDateTime.now();
        System.out.println(datetime);

        // Format date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E dd-MM-yyyy HH:mm:ss");
        String formattedDate = datetime.format(formatter);
        System.out.println(formattedDate);


        // Parse formatted date
        String format = "dd/MM/yyyy";
        formatter = DateTimeFormatter.ofPattern(format);
        LocalDate date_parsed = LocalDate.parse("01/05/2023", formatter);

        System.out.println(date_parsed);

    }
}

