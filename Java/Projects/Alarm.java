import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Alarm {
    public static void main(String[] args) {

        // we will create an alarm clock that plays music when the time comes
        // we will ask the user to enter the time in a formula of (HH:MM:SS) : 08:10:00
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the time you want to set the alarm to (HH:MM:SS) : ");
            String alarmTime = scanner.next();
            LocalTime timing = LocalTime.parse(alarmTime);
            // display that the alarm is set to that time
            System.out.println("The alarm is set to : " + timing);

            Timer timer = new Timer();
            TimerTask task = new TimerTask() {
                LocalTime startTime = LocalTime.now();

                @Override
                public void run() {
                    while (startTime.isBefore(timing)) {
                        startTime = LocalTime.now();
                        System.out.printf("%d:%d:%d \r", startTime.getHour(), startTime.getMinute(), startTime.getSecond());
                    }
                    System.out.println("The clock has reached the time!!!!!");
                    System.exit(0);

                }
            };
            timer.scheduleAtFixedRate(task, 0, 500);
        } catch (DateTimeParseException e) {
            System.out.println("incorrect hour format");
        }

        // the displayed message after is the current time , that will be counting until
        // it reaches the alarms time
        // after that play the music + (sout *Alarm noises* as a message)
        // the music will keep playing
        // we will ask the user to press enter if he wants to stop the alarm
    }
}
