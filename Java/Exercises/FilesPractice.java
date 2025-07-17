
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FilesPractice {
    public static void main(String[] args) {
        // this class will be only for operations on files (read,write)

        // there is many ways to write files in java
        // FileWriter = good for small or medium-sized text files
        // BufferedWriter = better performance for large amounts of text 
        // PritWriter = best for structured data , like reports or logs
        // FileOutputStream = best for binary files (e.g. , images , audio files)
        
        String filePath = "C:\\Users\\osaq\\Desktop\\Programming Exercices\\Java\\Exercises\\test.txt";
        String textContent = "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh";
        String multiLine = """
                bli bli bli
                blu blu blu 
                hep bli bli bli hhhhhh
                wazaaaaaaa
                """;


        try (FileWriter writer = new FileWriter(filePath)){// we should use try with ressources block with files
            writer.write(multiLine);
            System.out.println("file has been written");
        } 
        catch(FileNotFoundException e){
            System.out.println("could not locate the file ");
        } 
        catch (IOException e) {
            System.out.println("Could not write file");
        }
    }
}
