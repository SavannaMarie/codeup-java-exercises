import java.io.IOException;
import java.nio.file.*;
import java.io.*;

public class FileIOLecture {
    public static void main(String[] args) {
        Path path = Paths.get("src", "FileIOLecture.java");
        System.out.println(path.toAbsolutePath());

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/savanna/Desktop/test/test.txt"));
        } catch(Exception ex){
            return;
        }
    }
}
