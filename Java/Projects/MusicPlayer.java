
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class MusicPlayer {
    public static void main(String[] args) {
        // this is a project to work with audio files ad play some music (.wav , .au ,
        // .aiff)

        String filePath = "C:\\Users\\osaq\\Downloads\\نوض-القلاوي-نوض-nod-al9lawi-nod-Moroccan-Memes-Sound-Effect.wav";
        File file = new File(filePath);

        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Scanner scanner = new Scanner(System.in);) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

           
            String response = "";
            while (!response.equals("Q")) { 
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter your choice : ");
                response = scanner.next().toUpperCase();
                switch (response) {
                    case "P"-> clip.start();
                    case "S"-> clip.stop();
                    case "R"-> clip.setMicrosecondPosition(0);
                    case "Q"-> clip.close();
                    default -> System.out.println("Enter a valid choice");
                        
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("could not locate the file");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Unsuported audio file extension !!! ");
        } catch (LineUnavailableException e) {
            System.out.println("Unable to access audio resource");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("Bye !!!");

        }

    }
}
