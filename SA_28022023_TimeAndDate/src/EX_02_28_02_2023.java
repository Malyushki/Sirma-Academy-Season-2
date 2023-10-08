import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Scanner;

public class EX_02_28_02_2023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first date");
        int[] date1 = Arrays.stream(scanner.nextLine().split("\\.")).mapToInt(Integer::parseInt).toArray();
        System.out.println("Enter second date");
        int[] date2 = Arrays.stream(scanner.nextLine().split("\\.")).mapToInt(Integer::parseInt).toArray();


        try {


            LocalDate firstDate = LocalDate.of(date1[2], date1[1], date1[0]);
            LocalDate secondDate = LocalDate.of(date2[2], date2[1], date2[0]);
            if (firstDate.compareTo(secondDate) > 0) {
                System.out.println("First date is bigger");
                Period period = Period.between(secondDate, firstDate);
                System.out.printf("%s Years %s Months %s Days", period.getYears(), period.getMonths(),period.getDays());

            } else if(firstDate.compareTo(secondDate) < 0) {
                System.out.println("Second date is bigger");
                Period period = Period.between(firstDate, secondDate);
                System.out.printf("%s Years %s Months %s Days", period.getYears(), period.getMonths(),period.getDays());

            }else {
                System.out.println("The two dates coincide");
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}