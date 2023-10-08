import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class EX_04_28_02_2023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter time");
        int[] time = Arrays.stream(scanner.nextLine().split(":")).mapToInt(Integer::parseInt).toArray();


        try {
            LocalTime userTime = LocalTime.of(time[0], time[1]);
            LocalTime midnight = LocalTime.MIDNIGHT;
            System.out.println("Time until midnight: "+midnight.minusHours(userTime.getHour()).minusMinutes(userTime.getMinute()));

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}