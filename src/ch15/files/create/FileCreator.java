package ch15.files.create;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileCreator {
    public static void main(String[] args) {
        try {
            String directory = "/Users/folajimi/Documents/bigDawgz/src/ch15/files/output";
            //1.
            Path path = Path.of(directory, "numbers.txt");
            System.out.println("filePath::" + path);
            //2.
            Files.createFile(path);
        } catch (IOException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
