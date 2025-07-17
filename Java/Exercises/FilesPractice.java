import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilesPractice {
    public static void main(String[] args) {
        // how to read a file using java (3 popular options)

        // BufferedReader + fileReader : best for reading text files line-by-line
        // FileInput: best for binary files (e.g. , images , audio files)
        // RandomAccessFile: best for read/write specific portions of a large file

        String filePath = "C:\\Users\\osaq\\Desktop\\lorem.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) { 
                System.out.println(line);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("could not locate file");

        } catch(IOException e){
            System.out.println("something went wrong");
        }








        // this class will be only for operations on files (read,write)

        // there is many ways to write files in java
        // FileWriter = good for small or medium-sized text files
        // BufferedWriter = better performance for large amounts of text 
        // PritWriter = best for structured data , like reports or logs
        // FileOutputStream = best for binary files (e.g. , images , audio files)
        
        // String filePath = "C:\\Users\\osaq\\Desktop\\Programming Exercices\\Java\\Exercises\\test.txt";
        // // String textContent = "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh";
        // String multiLine = """
        //         bli bli bli
        //         blu blu blu 
        //         hep bli bli bli hhhhhh
        //         wazaaaaaaa
        //         """;


        // try (FileWriter writer = new FileWriter(filePath)){// we should use try with ressources block with files
        //     writer.write(multiLine);
        //     System.out.println("file has been written");
        // } 
        // catch(FileNotFoundException e){
        //     System.out.println("could not locate the file ");
        // } 
        // catch (IOException e) {
        //     System.out.println("Could not write file");
        // }
    }
}
