package ch15.files.deleter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileDeleter {
    public static boolean deleteFile(Path path){
        try {
            return Files.deleteIfExists(path);
        }catch (IOException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        return false;
    }
}
