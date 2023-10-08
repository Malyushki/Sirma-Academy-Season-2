import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EX_07_28_02_2023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int numberOfDates = 3;
            List<LocalDate> dateList = new ArrayList<>();
            DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            for (int i = 1; i <= numberOfDates; i++) {
                System.out.printf("Enter date %d%n", i);
                int[] dateInput = Arrays.stream(scanner.nextLine().split("\\.|\\-|\\/")).mapToInt(Integer::parseInt).toArray();
                LocalDate date = LocalDate.of(dateInput[2], dateInput[1], dateInput[0]);
                dateList.add(date);
            }

            dateList.sort(LocalDate::compareTo);

            System.out.println("Sorted dates:");
            dateList.forEach(a->System.out.println(a.format(dateFormat)));


        } catch (Exception e) {
            System.out.println("Enter date in format dd.MM.yyyy");
            e.printStackTrace();

        }
    }
}