import java.util.Scanner;

class Time {
    int hour;
    int minute;
    int second;
    int millisecond;
}

public class EX_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter hour: ");
        int hour = scanner.nextInt();
        System.out.println("Enter minutes: ");
        int minute = scanner.nextInt();
        System.out.println("Enter seconds: ");
        int second = scanner.nextInt();
        System.out.println("Enter milliseconds: ");
        int millisecond = scanner.nextInt();
        if (hour >= 0 && hour < 24) {
            if (minute < 60 && minute >= 0) {
                if (second < 60 && second >= 0) {
                    if (millisecond < 1000 && millisecond >= 0) {
                        Time time = new Time();
                        time.hour = hour;
                        time.minute = minute;
                        time.second = second;
                        time.millisecond = millisecond;
                        System.out.printf("%d:%d:%d:%d%n",time.hour,time.minute, time.second,time.millisecond);
                    }
                }
            }
        }else {
            System.out.println("Invalid Input");
        }
    }
}
