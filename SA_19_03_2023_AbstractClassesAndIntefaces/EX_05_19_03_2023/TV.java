package EX_05_19_03_2023;

import javax.swing.text.DateFormatter;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TV implements SmartTVRemote {
    boolean isOn;

    @Override
    public void showClock() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("The time is " + LocalTime.now().format(dtf));
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println("Welcome");

    }

    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println("TV is shutting down");

    }
}
