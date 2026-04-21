package ch15.files.deleter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoryDeleter {
    public static boolean deleteDirectory(Path path){
        try{
            return Files.deleteIfExists(path);
        } catch (IOException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        return false;
    }

    public static boolean isExisting(Path path){
            return Files.exists(path);
    }
}
