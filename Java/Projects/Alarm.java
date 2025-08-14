import java.io.File;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Alarm {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\osaq\\Downloads\\نوض-القلاوي-نوض-nod-al9lawi-nod-Moroccan-Memes-Sound-Effect.wav";
        File file = new File(filePath);

        Scanner scanner = new Scanner(System.in); // Keep open for the whole program

        try {
            // Ask user for alarm time
            System.out.print("Enter the time you want to set the alarm to (HH:MM:SS) : ");
            String alarmTime = scanner.next();
            LocalTime timing = LocalTime.parse(alarmTime);

            System.out.println("The alarm is set to : " + timing);

            Timer timer = new Timer();

            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    LocalTime now = LocalTime.now();
                    System.out.printf("%02d:%02d:%02d \r", now.getHour(), now.getMinute(), now.getSecond());

                    // When alarm time is reached or passed
                    if (!now.isBefore(timing)) {
                        System.out.println("\nThe clock has reached the time!!!!!");

                        // Play alarm sound in separate thread
                        new Thread(() -> {
                            try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {
                                Clip clip = AudioSystem.getClip();
                                clip.open(audioStream);
                                clip.loop(Clip.LOOP_CONTINUOUSLY); // Loop until stopped
                                System.out.println("Press S to stop the alarm.");
                                
                                String response = "";
                                while (!response.equalsIgnoreCase("S")) {
                                    response = scanner.next(); // Use same scanner
                                }

                                clip.stop();
                                clip.close();
                                System.out.println("Bye !!!");
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }).start();

                        timer.cancel(); // Stop timer so it doesn't keep checking
                    }
                }
            };

            // Check every second
            timer.scheduleAtFixedRate(task, 0, 1000);

        } catch (DateTimeParseException e) {
            System.out.println("Incorrect hour format. Please use HH:MM:SS.");
        }
    }
}
