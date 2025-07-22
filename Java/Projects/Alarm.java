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
            LocalTime localTime = LocalTime.now();
            LocalTime timing = LocalTime.parse(alarmTime);
            // display that the alarm is set to that time
            System.out.println("The alarm is set to : " + timing);

            Timer timer = new Timer();
            TimerTask task = new TimerTask() {
                LocalTime startTime = localTime;
                int seconds = startTime.getSecond();
                int minutes = startTime.getMinute();
                int hours = startTime.getHour();

                @Override
                public void run() {
                    if (seconds < 60) {
                        seconds++;
                        System.out.printf("%d:%d:%d\r", hours, minutes, seconds);
                    }
                    else{
                        seconds = 0;
                        minutes++;
                        System.out.println(hours+minutes+seconds);
                        System.exit(0);
                    }

                    // if (seconds == 60) {
                    // seconds = 0;
                    // minutes++;
                    // if (minutes == 60) {
                    // minutes = 0;
                    // hours++;
                    // }
                    // if (hours == 24) {
                    // hours = 0;

                    // }
                    // System.out.print(hours + ":" + minutes + ":" + seconds);
                    // System.out.println("time is up !! ");
                    // System.exit(0); // we write this code to make our programm exit fully
                    // }
                }
            };
            timer.scheduleAtFixedRate(task, 0, 1000);
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
